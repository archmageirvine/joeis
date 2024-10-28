package irvine.math.cr;

/**
 * Tangent function
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Tan extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return x.sin().divide(x.cos());
  }
}

