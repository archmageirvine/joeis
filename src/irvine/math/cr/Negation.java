package irvine.math.cr;

/**
 * Negation function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Negation extends UnaryCRFunction {

  @Override
  public CR execute(final CR x) {
    return x.negate();
  }
}
