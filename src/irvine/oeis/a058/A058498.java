package irvine.oeis.a058;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058498 Number of solutions to c(1)t(1) + ... + c(n)t(n) = 0, where c(i) = +-1 for i&gt;1, c(1) = t(1) = 1, t(i) = triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A058498 extends MemoryFunctionInt2<Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = 0;

  @Override
  protected Z compute(final int n, final int i) {
    final long m = (2 + (3L + i) * i) * i / 6;
    if (n > m) {
      return Z.ZERO;
    }
    if (n == m) {
      return Z.ONE;
    }
    return get(Math.abs(n - i * (i + 1) / 2), i - 1).add(get(n + i * (i + 1) / 2, i - 1));
  }

  @Override
  public Z next() {
    if ((++mN & 3) == 1) {
      return Z.ZERO;
    }
    return get(mN * (mN + 1) / 2, mN - 1);
  }
}
