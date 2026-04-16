package irvine.math.expression;

/**
 * An expression for the cosine.
 * @author Sean A. Irvine
 */
public class Cosine extends UnaryFunction {

  /**
   * Construct the  cosine of an expression.
   * @param expr expression to compute the cosine of
   */
  public Cosine(final Expression expr) {
    super(expr, "cos");
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
      return new Cosine(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Cosine(arg().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(cos(f(x))/dx -> -(sin(f(x))) * f'(x)
    return Multiply.create(arg().diff(var).eval(), new Negate(new Sine(arg())));
  }
}
