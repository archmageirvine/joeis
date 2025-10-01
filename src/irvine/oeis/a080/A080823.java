package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080823 a(n)=n for n&lt;=4; for n&gt;4, a(n) is the smallest integer greater than a(n-1) that shares common factors with some (i.e., at least one) but not all of previous 4 terms.
 * @author Sean A. Irvine
 */
public class A080823 extends Sequence1 {

  private final Z[] mA = {Z.ONE, Z.TWO, Z.THREE, Z.FOUR};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < mA.length) {
      return mA[mN++];
    }
    Z t = mA[3];
    while (true) {
      t = t.add(1);
      int cnt = 0;
      for (final Z v : mA) {
        if (!t.gcd(v).isOne()) {
          ++cnt;
        }
      }
      if (cnt > 0 && cnt < 4) {
        mA[0] = mA[1];
        mA[1] = mA[2];
        mA[2] = mA[3];
        mA[3] = t;
        return t;
      }
    }
  }
}
