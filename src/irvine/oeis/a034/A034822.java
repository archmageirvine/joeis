package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a002.A002779;

/**
 * A034822 Numbers n such that there are no palindromic squares of length n.
 * @author Sean A. Irvine
 */
public class A034822 extends A002779 {

  private int mPrevLength = super.next().toString().length();
  private int mT = 1;

  @Override
  public Z next() {
    while (true) {
      if (mT < mPrevLength) {
        return Z.valueOf(mT++);
      }
      final int len = super.next().toString().length();
      if (len > mPrevLength) {
        mT = mPrevLength + 1;
        mPrevLength = len;
      }
    }
  }
}

