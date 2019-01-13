package irvine.oeis.a005;

import irvine.oeis.a002.A002836;

/**
 * A005980.
 * @author Sean A. Irvine
 */
public class A005980 extends A002836 {

  @Override
  protected boolean shouldBeCounted() {
    return mP < 2 && mPP <= 2 && super.shouldBeCounted();
  }
}

