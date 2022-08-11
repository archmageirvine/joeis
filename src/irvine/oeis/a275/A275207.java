package irvine.oeis.a275;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A275207 Expansion of (A(x)^2+A(x^2))/2 where A(x) = A001006(x).
 * @author Georg Fischer
 */
public class A275207 implements SequenceWithOffset {

  private int mN = -1;

  /* Maple:
    b:= proc(n) option remember; `if`(n<2, 1,
        ((3*(n-1))*b(n-2)+(1+2*n)*b(n-1))/(n+2))
      end:
    a:= proc(n) option remember; add(b(j)*b(n-j), j=0..n/2)-
        `if`(n::odd, 0, (t-> t*(t-1)/2)(b(n/2)))
      end:
    seq(a(n), n=0..40);
  */
  private final MemoryFunction1<Z> mB = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ONE;
      }
      return get(n - 2).multiply(3 * (n - 1)).add(get(n - 1).multiply(2 * n + 1)).divide(n + 2);
    }
  };

  private final MemoryFunction1<Z> mA = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      Z sum = Z.ZERO;
      final int jmax = n / 2;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(mB.get(j).multiply(mB.get(n - j)));
      }
      if ((n & 1) != 1) {
        final Z t = mB.get(n / 2);
        sum = sum.subtract(t.multiply(t.add(-1)).divide2());
      }
      return sum;
    }
  };

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    return mA.get(++mN);
  }
}
