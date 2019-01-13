package irvine.math.cr;

/**
 * Exponential function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Exp extends UnaryCRFunction {

  @Override
  public CR execute(final CR x) {
    return x.exp();
  }
}
