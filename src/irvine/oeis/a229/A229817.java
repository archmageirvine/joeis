package irvine.oeis.a229;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A229817 Even bisection gives sequence a itself, n-&gt;a(2*(2*n+k)-1) gives k-th differences of a for k=1..4 with a(n)=n for n&lt;2..
 * @author Georg Fischer
 */
public class A229817 extends AbstractSequence implements DirectSequence {

  private int mN; // current index
  private int mR; // factor in formula

  /** Construct the sequence. */
  public A229817() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameter.
   * @param r factor in formula
   */
  public A229817(final int offset, final int r) {
    super(offset);
    mN = offset - 1;
    mR = 2 * r;
  }

  /* Maple:
    a:= proc(n) option remember; local m, q, r;
          m:= (irem(n, 8, 'q')+1)/2;
          `if`(n<2, n, `if`(irem(n, 2, 'r')=0, a(r),
          add(a(q+m-j)*(-1)^j*binomial(m, j), j=0..m)))
        end:
    seq(a(n), n=0..100);
  */
  private final MemoryFunction1<Z> mF = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      final int m = (n % mR + 1) / 2;
      final int q = n / mR;
      if (n < 2) {
        return Z.valueOf(n);
      }
      final int r = n / 2;
      if ((n & 1) == 0) {
        return get(r);
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= m; ++j) {
        sum = sum.add(get(q + m - j).multiply(((j & 1) == 0) ? 1 : -1).multiply(Binomial.binomial(m, j)));
      }
      return sum;
    }
  };

  @Override
  public Z a(final int n) {
    return mF.get(n);
  }

  @Override
  public Z a(final Z n) {
    return mF.get(n.intValueExact());
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
