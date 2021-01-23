package irvine.oeis.a036;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036913 Sparsely totient numbers; numbers n such that m &gt; n implies phi(m) &gt; phi(n).
 * @author Sean A. Irvine
 */
public class A036913 implements Sequence {

  private Z mMax = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z max = Z.ZERO;
      for (final Z t : Euler.inversePhi(Z.valueOf(++mN))) {
        max = max.max(t);
      }
      if (max.compareTo(mMax) > 0) {
        mMax = max;
        return mMax;
      }
    }
  }
}
