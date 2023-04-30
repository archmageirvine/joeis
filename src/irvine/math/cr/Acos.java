package irvine.math.cr;

/**
 * Arccosine function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Acos extends UnaryCRFunction {

  @Override
  public CR execute(final CR x) {
    return CR.HALF_PI.subtract(new Sin().inverseMonotone(CR.HALF_PI.negate(), CR.HALF_PI).execute(x));
  }
}
