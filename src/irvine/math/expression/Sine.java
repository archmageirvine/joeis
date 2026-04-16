package irvine.math.expression;

/**
 * An expression for the sine.
 * @author Sean A. Irvine
 */
public class Sine extends UnaryFunction {

  /**
   * Construct the sine of an expression.
   * @param expr expression to compute the sine of
   */
  public Sine(final Expression expr) {
    super(expr, "sin");
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
      return new Sine(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Sine(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(sin(f(x))/dx -> (cos(f(x))) * f'(x)
    return Multiply.create(arg().diff(var).eval(), new Cosine(arg()));
  }
}
