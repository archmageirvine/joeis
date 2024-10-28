package irvine.math.cr;

/**
 * Arctangent function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Atan extends UnaryCrFunction {

  // This uses the identity (sin x)^2 = (tan x)^2/(1 + (tan x)^2)
  // Since we know the tangent of the result, we can get its sine,
  // and then use the asin function.  Note that we don't always
  // want the positive square root when computing the sine.

  @Override
  public CR execute(final CR x) {
    final CR x2 = x.multiply(x);
    final CR absSinAtan = x2.divide(CR.ONE.add(x2)).sqrt();
    final CR sinAtan = x.select(absSinAtan.negate(), absSinAtan);
    return new Sin().inverseMonotone(CR.HALF_PI.negate(), CR.HALF_PI).execute(sinAtan);
  }
}
