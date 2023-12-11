package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A017125 Table read by antidiagonals of Fibonacci-type sequences.
 * @author Sean A. Irvine
 */
public class A017125 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m <= 1) {
      return m == 1 ? Z.ONE : Z.valueOf(n);
    }
    return get(n, m - 1).add(get(n, m - 2));
  }
}

