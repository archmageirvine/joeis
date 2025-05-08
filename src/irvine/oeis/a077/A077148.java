package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077148 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (cnt != mN) {
      if (Functions.GCD.l(mN, ++m) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(m + 1);
  }
}

