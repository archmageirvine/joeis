package irvine.math.cr;

/**
 * Sine function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Sin extends UnaryCRFunction {
  
  @Override
  public CR execute(final CR x) {
    return x.sin();
  }
}
