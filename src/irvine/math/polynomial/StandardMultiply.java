package irvine.math.polynomial;

/**
 * Standard polynomial multiplication operation.
 * @author Sean A. Irvine
 */
public final class StandardMultiply implements MultivariateMonomialOperation {

  /** Standard multiplication operation. */
  public static final StandardMultiply OP = new StandardMultiply();

  private StandardMultiply() { }

  @Override
  public MultivariateMonomial op(final MultivariateMonomial alpha, final MultivariateMonomial beta) {
    final MultivariateMonomial copy = alpha.copy();
    copy.multiply(beta);
    return copy;
  }

}
