package irvine.oeis.a390;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A390491 Array of Fibonacci polynomial linear combinations read by antidiagonals: T(m,r) = F_m(r) + 2*F_{m-1}(r) + F_{m-2}(r) where F_k(r) is the k-th Fibonacci polynomial evaluated at r (m &gt;= 2, r &gt;= 1).
 * @author Sean A. Irvine
 */
public class A390491 extends AbstractSequence {

  private int mN = 0;
  private int mM = -1;

  protected A390491(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A390491() {
    this(2);
  }

  private final MemoryFunctionInt2<Z> mF = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int k, final int r) {
      if (k == 0) {
        return Z.ZERO;
      }
      if (k == 1) {
        return Z.ONE;
      }
      return get(k - 1, r).add(get(k - 2, r).multiply(r));
    }
  };

  protected Z t(final int m, final int r) {
    return mF.get(m, r).add(mF.get(m - 1, r).multiply2()).add(mF.get(m - 2, r));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 2, mN - mM + 1);
  }
}
