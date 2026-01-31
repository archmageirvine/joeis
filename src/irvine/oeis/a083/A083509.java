package irvine.oeis.a083;

import irvine.oeis.a036.A036057;

/**
 * A083509 Friedman numbers that involve the "^" sign.
 * @author Sean A. Irvine
 */
public class A083509 extends A036057 {

  // todo this misses some value at present due to multiple representations

  @Override
  protected boolean isFriedman(final int n) {
    if (!super.isFriedman(n)) {
      return false;
    }
    return mAnswer.getDesc().contains("^");
  }
}

