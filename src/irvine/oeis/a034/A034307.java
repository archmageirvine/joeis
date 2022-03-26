package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a028.A028337;

/**
 * A034307 Numbers n such that there are no oblong (promic) palindromes of length n.
 * @author Sean A. Irvine
 */
public class A034307 extends A028337 {

  private int mLen = 1;
  private int mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (mM < mLen) {
        return Z.valueOf(mM++);
      }
      final int len = super.next().toString().length();
      if (len > mLen) {
        mM = mLen + 1;
        mLen = len;
      }
    }
  }
}
