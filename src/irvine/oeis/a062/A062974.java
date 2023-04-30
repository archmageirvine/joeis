package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062974 Numbers k such that omega(k+1) &lt; 2*omega(k), where omega(k) is the number of distinct prime divisors of k.
 * @author Sean A. Irvine
 */
public class A062974 extends Sequence1 {

  private long mN = 1;
  private int mOmega = 0;

  @Override
  public Z next() {
    while (true) {
      final int prev = mOmega;
      mOmega = Jaguar.factor(++mN).omega();
      if (mOmega < 2 * prev) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

