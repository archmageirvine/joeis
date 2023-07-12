package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048003 Triangular array T read by rows: T(h,k) = number of binary words of length h and maximal runlength k.
 * @author Sean A. Irvine
 */
public class A048003 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A048003() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 1 || m > n) {
      return Z.ZERO;
    }
    if (m == 1 || m.equals(n)) {
      return Z.TWO;
    }
    return get(n - 1, m).multiply2()
      .add(get(n - 1, m - 1))
      .subtract(get(n - 2, m - 1).multiply2())
      .add(get(n - m, m - 1))
      .subtract(get(n - m - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
