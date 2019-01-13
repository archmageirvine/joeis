package irvine.math.expression;

import irvine.math.z.Z;

/**
 * An expression for the exponential.
 * @author Sean A. Irvine.
 */
public class Fibonacci extends UnaryFunction {

  /**
   * Construct the exponential of an expression.
   * @param expr expression to compute the exponential of
   */
  public Fibonacci(final Expression expr) {
    super(expr, "fibonacci");
  }

  @Override
  public Expression performEval() {
    final Expression expr = arg().eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal) expr;
      if (lit.value() instanceof Z) {
        return new LiteralZ(irvine.math.z.Fibonacci.fibonacci(((Z) lit.value()).intValueExact()));
      }
      throw new UnsupportedOperationException("Fibonacci on " + lit.ring());
    }
    if (expr == arg()) {
      return this;
    } else {
      return new Fibonacci(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Fibonacci(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    throw new UnsupportedOperationException();
  }
}
