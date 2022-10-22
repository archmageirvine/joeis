package irvine.oeis.a341;

import irvine.math.LongUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A341064 Number of ways to write n as an ordered sum of 4 squarefree numbers.
 * @author Georg Fischer
 */
public class A341064 extends AbstractSequence {

  private int mN;
  private final int mNpart;

  /** Construct the sequence. */
  public A341064() {
    this(4, 4);
  }

  /**
   * Generic constructor with parameter
   * @param npart number of parts
   */
  public A341064(final int offset, final int npart) {
    super(offset);
    mNpart = npart;
    mN = offset - 1;
  }

  /* Maple:
    b:= proc(n, t) option remember;
          `if`(n=0, `if`(t=0, 1, 0), `if`(t<1, 0, add(
          `if`(numtheory[issqrfree](j), b(n-j, t-1), 0), j=1..n)))
        end:
    a:= n-> b(n, 4):
    seq(a(n), n=4..57);  # _Alois P. Heinz_, Feb 04 2021
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int t) {
      if (n == 0) {
        return t == 0 ? Z.ONE : Z.ZERO;
      }
      if (t < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        if (LongUtils.isSquareFree(j)) {
          sum = sum.add(get(n - j, t - 1));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, mNpart);
  }
}
