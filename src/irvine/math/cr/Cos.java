package irvine.math.cr;

/**
 * Cosine function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Cos extends UnaryCRFunction {
  
  @Override
  public CR execute(final CR x) {
    return x.cos();
  }
}
