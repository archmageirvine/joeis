package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A072233 Square array T(n,k) read by antidiagonals giving number of ways to distribute n indistinguishable objects in k indistinguishable containers; containers may be left empty.
 * See A008284.
 * @author Georg Fischer
 */
public class A072233 extends MemoryFunction2Sequence<Long, Z> implements DirectArray {

  /** Construct the sequence. */
  public A072233() {
    super(0);
  }

  @Override
  protected Z compute(final Long n, final Long k) {
    return get(n - 1, k - 1).add(get(n - k, k));
  }

  @Override
  public Z get(final Long n, final Long k) {
    if (k == 1 || n.equals(k)) {
      return Z.ONE;
    }
    if (k > n || k < 1) {
      return Z.ZERO;
    }
    return super.get(n, k);
  }

  private long mN = -1;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }

  @Override
  public Z a(final long n, final long k) {
    return get(Long.valueOf(n), Long.valueOf(k));
  }
}
