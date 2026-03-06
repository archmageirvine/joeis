package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393689 allocated for Dimana Pramatarova.
 * @author Sean A. Irvine
 */
public class A393689 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int k) {
    return (n & 1) == 0
      ? Z.valueOf(n).multiply(n - 2).multiply(2L * n + 1).multiply(k).divide(12)
      : Z.valueOf(n).square().subtract(1).multiply(2L * n - 3).multiply(k).divide(12);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 2, mN - mM + 1);
  }
}

