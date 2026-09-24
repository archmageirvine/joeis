package irvine.oeis.a216;
// manually 2026-09-21/mlamlon

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A216966 O.g.f.: 1/(1 - x/(1 - 2^3*x/(1 - 3^3*x/(1 - 4^3*x/(1 - 5^3*x/(1 - 6^3*x/(1 -...))))))), a continued fraction.
 * @author Georg Fischer
 */
public class A216966 extends AbstractSequence implements DirectSequence {

  private long mN;
  private long mColNo;

  /** Construct the sequence. */
  public A216966() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param colNo column number
   */
  public A216966(final int offset, final long colNo) {
    super(offset);
    mN = offset - 1;
    mColNo = colNo;
  }

  protected final MemoryFunction2<Long, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Long n, final Long k) {
      return
        (k == 0) ? Z.ONE : (k == n ? get(n, k - 1) : Z.valueOf(k - n - 1).pow(mColNo).multiply((mColNo & 1) == 1 ? -1 : 1).multiply(get(n, k - 1)).add(get(n - 1, k)));
    }
  };

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return mB.get(n, n);
  }
}
