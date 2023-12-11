package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A050602 Square array A(x,y), read by antidiagonals, where A(x,y) = 0 if (x AND y) = 0, otherwise A(x,y) = 1+A(x XOR y, 2*(x AND y)).
 * @author Sean A. Irvine
 */
public class A050602 extends MemoryFunction2Sequence<Long, Long> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Long compute(final Long n, final Long m) {
    return (m & n) == 0 ? 0L : 1 + get(n ^ m, (n & m) << 1);
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return Z.valueOf(get(mN - mM, mM));
  }
}
