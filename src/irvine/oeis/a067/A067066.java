package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067037.
 * @author Sean A. Irvine
 */
public class A067066 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, m - 1, k -> Z.valueOf(n - 1).pow(k)).multiply(n);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}

