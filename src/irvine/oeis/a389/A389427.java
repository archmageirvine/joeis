package irvine.oeis.a389;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389427 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A389427 extends Sequence0 {

  private int mN = -1;

  private long m(final int i, final int j, final int n) {
    return 1 - j + (long) i * n + (2L * j - n - 1) * (i & 1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, i ->
      Integers.SINGLETON.product(1, mN, j -> Z.valueOf(m(j, (mN + i + j - 2) % mN + 1, mN)))
        .subtract(Integers.SINGLETON.product(1, mN, j -> Z.valueOf(m(j, (mN + i - j - 1) % mN + 1, mN)))));
  }
}
