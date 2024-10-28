package irvine.math.cr;

/**
 * Inversion function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Inversion extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return x.inverse();
  }
}
