package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393817 allocated for Robert FERREOL.
 * @author Sean A. Irvine
 */
public class A393817 extends Sequence1 {

  private long mN = 0;

  private long[] baker(final long i, final long j, final long n) {
    final long i1 = i / 2;
    final long j1 = 2 * j + (i & 1);
    if (j1 < 0) {
      throw new ArithmeticException();
    }
    return j1 < n ? new long[] {i1, j1} : new long[] {n - 1 - i1, 2 * n - 1 - j1};
  }

  private long pixelP(final long i, final long j, final long n) {
    long[] u = baker(i, j, n);
    long m = 1;
    while (u[0] != i || u[1] != j) {
      u = baker(u[0], u[1], n);
      ++m;
    }
    return m;
  }

  @Override
  public Z next() {
    ++mN;
    Z period = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        period = period.lcm(pixelP(k, j, mN));
      }
    }
    return period;
  }
}
