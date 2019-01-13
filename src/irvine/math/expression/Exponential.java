package irvine.math.expression;

/**
 * An expression for the exponential.
 * @author Sean A. Irvine.
 */
public class Exponential extends UnaryFunction {

  /**
   * Construct the exponential of an expression.
   * @param expr expression to compute the exponential of
   */
  public Exponential(final Expression expr) {
    super(expr, "exp");
  }

  @Override
  public Expression performEval() {
    final Expression expr = arg().eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal) expr;
      if (lit.ring().zero().equals(lit.value())) {
        return LiteralZ.LIT_ONE;
      }
    }
    if (expr == arg()) {
      return this;
    } else {
      return new Exponential(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Exponential(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(exp(f(x))/dx -> exp(f(x)) * f'(x)
    return Multiply.create(arg().diff(var).eval(), this).eval();
  }
}
