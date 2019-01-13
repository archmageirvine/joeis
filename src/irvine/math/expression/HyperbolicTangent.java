package irvine.math.expression;

/**
 * An expression for the hyperbolic tangent.
 * @author Sean A. Irvine.
 */
public class HyperbolicTangent extends UnaryFunction {

  /**
   * Construct the hyperbolic tangent of an expression.
   * @param expr expression to compute the hyperbolic tangent of
   */
  public HyperbolicTangent(final Expression expr) {
    super(expr, "tanh");
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
      return new HyperbolicTangent(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new HyperbolicTangent(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(tanh(f(x))/dx -> (1 - tanh^2(f(x))) * f'(x)
    return Multiply.create(arg().diff(var).eval(), Subtract.create(LiteralZ.LIT_ONE, new Power(this, LiteralZ.LIT_TWO))).eval();
  }
}
