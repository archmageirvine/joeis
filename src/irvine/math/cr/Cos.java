package irvine.math.cr;

/**
 * Cosine function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Cos extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return x.cos();
  }
}
