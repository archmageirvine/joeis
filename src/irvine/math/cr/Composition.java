package irvine.math.cr;

/**
 * Composition of constructible real functions.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Composition extends UnaryCRFunction {

  private final UnaryCRFunction mF1;
  private final UnaryCRFunction mF2;

  Composition(final UnaryCRFunction func1, final UnaryCRFunction func2) {
    mF1 = func1;
    mF2 = func2;
  }

  @Override
  public CR execute(final CR x) {
    return mF1.execute(mF2.execute(x));
  }
}

