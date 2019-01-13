package irvine.math.expression;

import java.util.Map;

/**
 * Collapse additions to the extent possible.
 * @author Sean A. Irvine
 */
public class AddCollapser extends Collapser<Add> {

  AddCollapser() {
    super(Add.class, Multiply.class, null);
  }

  // This is heuristic to try and cope with E + E * F.  It is hoped that F will be
  // the less complex of the two expressions.  Note this complication does not arise
  // in the MultiplyCollapser since it powering is not commutative.
  @Override
  protected Expression getBase(final AbstractLeftRightExpression expr) {
    return expr.left().complexity() < expr.right().complexity() ? expr.right() : expr.left();
  }

  @Override
  protected Expression getMultiplicity(final AbstractLeftRightExpression expr) {
    return expr.left().complexity() < expr.right().complexity() ? expr.left() : expr.right();
  }

  @Override
  protected Expression combine(final Expression a, final Expression b) {
    return new Add(a, b);
  }

  @Override
  protected Expression combineNegated(final Expression a, final Expression b) {
    return new Add(a == null ? LiteralZ.LIT_ZERO : a, new Negate(b).eval()).eval();
  }

  @Override
  protected Expression combineMultiplicity(final Expression a, final Expression multiplicity) {
    return Multiply.create(a, multiplicity);
  }

  @Override
  protected void collate(final Map<Expression, Expression> terms, final Expression expr, final Expression enclosingMultiplicity, final boolean negate) {
    if (expr instanceof Negate) {
      collate(terms, ((Negate) expr).arg(), enclosingMultiplicity, !negate);
    } else {
      super.collate(terms, expr, enclosingMultiplicity, negate);
    }
  }
}
