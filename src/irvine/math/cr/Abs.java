package irvine.math.cr;

/**
 * Absolute value function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Abs extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return x.abs();
  }
}
