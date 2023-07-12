package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A002735 Related to Euler numbers.
 * @author Sean A. Irvine
 */
public class A002735 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A002735() {
    super(1);
  }

  private long mN = 0;

  @Override
  protected Z compute(final Long m, final Long n) {
    if (n == 1) {
      return Z.valueOf(m).square();
    }
    if ((n & 1) == 0) {
      Z s = Z.ZERO;
      for (long k = 1; k <= m + 1; ++k) {
        s = s.add(get(k, n - 1));
      }
      return s;
    } else {
      return get(m, n - 1).multiply(get(m, 1L));
    }
  }

  @Override
  public Z next() {
    return get(2L, ++mN);
  }
}
