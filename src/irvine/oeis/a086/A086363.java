package irvine.oeis.a086;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000085;
import irvine.oeis.a005.A005425;

/**
 * A086363 Array T(m,n) read by antidiagonals: if X and Y are two (possibly empty) finite sets with m and n elements respectively and Z is the disjoint union of X and Y, then T(m,n) is the number of self-inverse partial functions f:Z -&gt;Z which do not fix any element of Y.
 * @author Sean A. Irvine
 */
public class A086363 extends Sequence0 {

  private final DirectSequence mA85 = new A000085();
  private final DirectSequence mA5425 = DirectSequence.create(new A005425());
  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return mA85.a(m);
      }
      if (m > 1) {
        return get(n, m - 1).add(get(n - 1, m - 1).multiply(n)).add(get(n, m - 2).multiply(m - 1));
      }
      return mA5425.a(n).add(m > 0 ? mA5425.a(n - 1).multiply(n) : Z.ZERO);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}
