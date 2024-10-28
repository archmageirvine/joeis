package irvine.math.cr;

/**
 * Logarithm function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Log extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return x.log();
  }
}
