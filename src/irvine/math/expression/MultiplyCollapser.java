package irvine.math.expression;

/**
 * Collapse multiplications to the extent possible.
 * @author Sean A. Irvine
 */
public class MultiplyCollapser extends Collapser<Multiply> {

  MultiplyCollapser() {
    super(Multiply.class, Power.class, Divide.class);
  }

  @Override
  protected Expression combine(final Expression a, final Expression b) {
    return new Multiply(a, b);
  }

  @Override
  protected Expression combineNegated(final Expression a, final Expression b) {
    return new Divide(a == null ? LiteralZ.LIT_ONE : a, b).eval();
  }

  @Override
  protected Expression combineMultiplicity(final Expression a, final Expression multiplicity) {
    return new Power(a, multiplicity);
  }
}
