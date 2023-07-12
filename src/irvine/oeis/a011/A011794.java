package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A011794 Triangle defined by a(n+1,k)=a(n,k-1)+a(n-1,k), a(n,1)=1, a(1,k)=1, a(2,k)=min(2,k).
 * @author Sean A. Irvine
 */
public class A011794 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A011794() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 1 || k <= 1) {
      return Z.ONE;
    }
    if (n == 2) {
      return Z.TWO.min(Z.valueOf(k));
    }
    return get(n - 1, k - 1).add(get(n - 2, k));
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
