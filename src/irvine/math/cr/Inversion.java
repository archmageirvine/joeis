package irvine.math.cr;

/**
 * Inversion function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Inversion extends UnaryCRFunction {

  @Override
  public CR execute(final CR x) {
    return x.inverse();
  }
}
