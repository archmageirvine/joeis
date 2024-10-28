package irvine.math.cr;

/**
 * Square root function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class SquareRoot extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return x.sqrt();
  }
}

