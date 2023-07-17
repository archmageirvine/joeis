package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a001.A001285;

/**
 * A005681 A squarefree quaternary sequence.
 * @author Sean A. Irvine
 */
public class A005681 extends A001285 {

  /** Construct the sequence. */
  public A005681() {
    super(1);
  }

  private int mPrev = super.next().intValueExact();

  @Override
  public Z next() {
    final int t = mPrev;
    mPrev = super.next().intValueExact();
    switch (t * 10 + mPrev) {
      case 11:
        return Z.ONE;
      case 12:
        return Z.TWO;
      case 21:
        return Z.THREE;
      default: // 22
        return Z.FOUR;
    }
  }
}

