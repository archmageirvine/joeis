package irvine.math.expression;

/**
 * An expression for the hyperbolic sine.
 * @author Sean A. Irvine
 */
public class HyperbolicSine extends UnaryFunction {

  /**
   * Construct the exponential of an expression.
   * @param expr expression to compute the exponential of
   */
  public HyperbolicSine(final Expression expr) {
    super(expr, "sinh");
  }

  @Override
  public Expression performEval() {
    final Expression expr = arg().eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal) expr;
      if (lit.ring().zero().equals(lit.value())) {
        return LiteralZ.LIT_ZERO;
      }
    }
    if (expr == arg()) {
      return this;
    } else {
      return new HyperbolicSine(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new HyperbolicSine(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(sinh(f(x))/dx -> (cosh(f(x))) * f'(x)
    return Multiply.create(arg().diff(var).eval(), new HyperbolicCosine(arg()));
  }
}
