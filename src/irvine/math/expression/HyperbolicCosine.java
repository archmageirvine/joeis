package irvine.math.expression;

/**
 * An expression for the hyperbolic cosine.
 * @author Sean A. Irvine.
 */
public class HyperbolicCosine extends UnaryFunction {

  /**
   * Construct the hyperbolic cosine of an expression.
   * @param expr expression to compute the exponential of
   */
  public HyperbolicCosine(final Expression expr) {
    super(expr, "cosh");
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
      return new HyperbolicCosine(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new HyperbolicCosine(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(cosh(f(x))/dx -> (sinh(f(x))) * f'(x)
    return Multiply.create(arg().diff(var).eval(), new HyperbolicSine(arg()));
  }
}
