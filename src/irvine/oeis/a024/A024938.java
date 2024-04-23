package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A024938 Total number of parts in all partitions of n into distinct prime parts.
 * @author Sean A. Irvine
 */
public class A024938 extends MemoryFunction2Sequence<Integer, Z[]> {

  /** Construct the sequence. */
  public A024938() {
    super(1);
  }

  // After Alois P. Heinz

  private static final Z[] C1 = {Z.ONE, Z.ZERO};
  private static final Z[] C2 = {Z.ZERO, Z.ZERO};
  private int mN = 0;
  private int mPi = 0;
  private final Fast mFast = new Fast();

  @Override
  protected Z[] compute(final Integer n, final Integer m) {
    if (n == 0) {
      return C1;
    }
    if (m < 1) {
      return C2;
    }
    final Z[] b = get(n, m - 1);
    if ((int) Functions.PRIME.l(m) > n) {
      return b;
    }
    final Z[] g = get(n - (int) Functions.PRIME.l(m), m - 1);
    return new Z[] {
      b[0].add(g[0]),
      b[1].add(g[1]).add(g[0])
    };
  }

  @Override
  public Z next() {
    if (mFast.isPrime(++mN)) {
      ++mPi;
    }
    return get(mN, mPi)[1];
  }
}
