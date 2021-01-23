package irvine.math.expression;

/**
 * An expression for negation.
 * @author Sean A. Irvine
 */
public class Negate extends AbstractExpression {

  private final Expression mExpr;

  /**
   * Construct the negation of an expressions.
   * @param expr expression to negate
   */
  public Negate(final Expression expr) {
    mExpr = expr;
  }

  Expression arg() {
    return mExpr;
  }

  @Override
  public <T> Expression performEval() {
    final Expression expr = mExpr.eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal) expr;
      if (lit.ring().zero().equals(lit.value())) {
        return expr;
      }
      final Literal<T, ?> l = Coercion.force(lit);
      return Literal.create(l.ring().negate(l.value()));
    } else if (expr instanceof Negate) {
      return ((Negate) expr).mExpr;
    } else if (expr instanceof Multiply && ((Multiply) expr).left() instanceof Literal<?, ?>) {
      final Literal<T, ?> l = Coercion.force((Literal) ((Multiply) expr).left());
      return Multiply.create(Literal.create(l.ring().negate(l.value())), ((Multiply) expr).right());
    } else if (expr == mExpr) {
      return this;
    } else {
      return new Negate(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Negate(mExpr.substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    return new Negate(arg().diff(var)).eval();
  }

  @Override
  public int complexity() {
    return 1 + mExpr.complexity();
  }

  @Override
  public Precedence precedence() {
    return Precedence.ADD;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr) || mExpr.contains(expr);
  }

  @Override
  public Expression expand() {
    final Expression e = mExpr.expand();
    if (e instanceof Add) {
      return new Add(new Negate(((Add) e).left()).eval().expand(), new Negate(((Add) e).right()).eval().expand());
    }
    return super.expand();
  }

  @Override
  public String toString() {
    return "-" + ExpressionUtils.toString(arg());
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Negate)) {
      return false;
    }
    final Negate that = (Negate) obj;
    return mExpr.equals(that.mExpr);
  }

  @Override
  public int hashCode() {
    return -mExpr.hashCode();
  }
}
