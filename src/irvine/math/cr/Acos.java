package irvine.math.cr;

/**
 * Arccosine function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Acos extends UnaryCRFunction {

  @Override
  public CR execute(final CR x) {
    return CR.HALF_PI.subtract(ASIN.execute(x));
  }
}
