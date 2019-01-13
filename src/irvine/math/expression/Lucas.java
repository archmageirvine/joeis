package irvine.math.expression;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;

/**
 * An expression for Lucas numbers.
 * @author Sean A. Irvine.
 */
public class Lucas extends UnaryFunction {

  /**
   * Construct the Lucas number of an expression.
   * @param expr expression to compute the Lucas number of
   */
  public Lucas(final Expression expr) {
    super(expr, "lucas");
  }

  @Override
  public Expression performEval() {
    final Expression expr = arg().eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal) expr;
      if (lit.value() instanceof Z) {
        return new LiteralZ(Fibonacci.lucas(((Z) lit.value()).intValueExact()));
      }
      throw new UnsupportedOperationException("Lucas on " + lit.ring());
    }
    if (expr == arg()) {
      return this;
    } else {
      return new Lucas(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Lucas(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    throw new UnsupportedOperationException();
  }
}
