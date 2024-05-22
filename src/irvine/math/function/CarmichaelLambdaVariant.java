package irvine.math.function;

import irvine.math.z.Z;

/**
 * Variant of Carmichael lambda function.
 * @author Sean A. Irvine
 */
class CarmichaelLambdaVariant extends AbstractFunction1 {

  private final CarmichaelLambda mLambda = new CarmichaelLambda();

  @Override
  public Z z(final Z n) {
    return n.equals(Z.TWO) ? Z.ONE : mLambda.z(n.multiply2());
  }

  @Override
  public Z z(final long n) {
    return n == 2 ? Z.ONE : mLambda.z(2L * n);
  }
}
