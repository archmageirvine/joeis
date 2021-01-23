package irvine.math.expression;

/**
 * An expression for the natural logarithm.
 * @author Sean A. Irvine
 */
public class Logarithm extends UnaryFunction {

  /**
   * Construct the logarithm of an expression.
   * @param expr expression to compute the logarithm of
   */
  public Logarithm(final Expression expr) {
    super(expr, "log");
  }

  @Override
  public Expression performEval() {
    final Expression expr = arg().eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal) expr;
      if (lit.ring().one().equals(lit.value())) {
        return LiteralZ.LIT_ZERO;
      }
    }
    if (expr == arg()) {
      return this;
    } else {
      return new Logarithm(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Logarithm(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(log(f(x)) -> f'(x) / x
    return new Divide(arg().diff(var).eval(), arg()).eval();
  }
}
