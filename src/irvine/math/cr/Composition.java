package irvine.math.cr;

/**
 * Composition of constructible real functions.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Composition extends UnaryCrFunction {

  private final UnaryCrFunction mF1;
  private final UnaryCrFunction mF2;

  Composition(final UnaryCrFunction func1, final UnaryCrFunction func2) {
    mF1 = func1;
    mF2 = func2;
  }

  @Override
  public CR execute(final CR x) {
    return mF1.execute(mF2.execute(x));
  }
}

