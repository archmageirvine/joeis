package irvine.math.expression;

import java.util.HashMap;
import java.util.Map;

/**
 * Intelligent collapsing of expression terms.
 * @author Sean A. Irvine
 */
abstract class Collapser<T extends AbstractLeftRightExpression> {

  private final Class<T> mClass;
  private final Class<? extends AbstractLeftRightExpression> mUpperClass;
  private final Class<? extends AbstractLeftRightExpression> mConverseClass;

  Collapser(final Class<T> clazz, final Class<? extends AbstractLeftRightExpression> upperClazz, final Class<? extends AbstractLeftRightExpression> converseClazz) {
    mClass = clazz;
    mUpperClass = upperClazz;
    mConverseClass = converseClazz;
  }

  protected Expression getBase(final AbstractLeftRightExpression expr) {
    return expr.left();
  }

  protected Expression getMultiplicity(final AbstractLeftRightExpression expr) {
    return expr.right();
  }

  protected void collate(final Map<Expression, Expression> terms, final Expression expr, final Expression enclosingMultiplicity, final boolean negate) {
    if (expr.getClass() == mClass) {
      @SuppressWarnings("unchecked")
      final T e = (T) expr;
      collate(terms, e.left(), enclosingMultiplicity, negate);
      collate(terms, e.right(), enclosingMultiplicity, negate);
    } else if (expr.getClass() == mConverseClass) {
      @SuppressWarnings("unchecked")
      final AbstractLeftRightExpression e = (AbstractLeftRightExpression) expr;
      collate(terms, e.left(), enclosingMultiplicity, negate);
      collate(terms, e.right(), enclosingMultiplicity, !negate);
    } else if (expr.getClass() == mUpperClass) {
      // e.g. for the MultiplyCollapser x * x^2 -> x^3
      final Expression base = getBase((AbstractLeftRightExpression) expr);
      final Expression mult = getMultiplicity((AbstractLeftRightExpression) expr);
      final Expression mna = negate ? new Negate(mult).eval() : mult;
      final Expression mn = Multiply.create(enclosingMultiplicity, mna).eval();
      final Expression multiplicity = terms.get(base);
      final Expression newMultiplicity = multiplicity == null ? mn : Add.create(multiplicity, mn).eval();
      if (base.getClass() == mClass) {
        collate(terms, base, newMultiplicity, false);
      } else {
        terms.put(base, newMultiplicity);
      }
    } else {
      final Expression mn = negate ? new Negate(enclosingMultiplicity).eval() : enclosingMultiplicity;
      final Expression multiplicity = terms.get(expr);
      terms.put(expr, multiplicity == null ? mn : Add.create(multiplicity, mn).eval());
    }
  }

  protected abstract Expression combine(final Expression a, final Expression b);

  protected abstract Expression combineNegated(final Expression a, final Expression b);

  protected abstract Expression combineMultiplicity(final Expression a, final Expression multiplicity);

  Expression collapse(final Expression expr) {
    final HashMap<Expression, Expression> terms = new HashMap<>();
    collate(terms, expr, LiteralZ.LIT_ONE, false);
    Expression lit = null;
    Expression nonLit = null;
    for (final Map.Entry<Expression, Expression> e : terms.entrySet()) {
      final Expression ex = e.getKey();
      final Expression multiplicity = e.getValue();
      final Expression t = multiplicity == LiteralZ.LIT_ONE ? ex : combineMultiplicity(ex, multiplicity).eval();
      if (multiplicity.equals(LiteralZ.LIT_NEG_ONE)) {
        nonLit = combineNegated(nonLit, ex).eval();
      } else if (t instanceof Literal) {
        lit = lit == null ? t : combine(lit, t).eval();
        assert lit instanceof Literal : lit.getClass() + " " + lit;
      } else {
        nonLit = nonLit == null ? t : combine(nonLit, t).eval();
      }
    }
    assert lit != null || nonLit != null;
    if (lit == null) {
      return nonLit;
    }
    if (nonLit == null) {
      return lit;
    }
    return combine(lit, nonLit);
  }
}
