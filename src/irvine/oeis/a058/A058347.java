package irvine.oeis.a058;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058347 Array T(n,k), n,k nonnegative: the total number of checks required by a "double-support" algorithm to find out which rows and columns of each of the n by k zero-one matrices are nonzero.
 * @author Sean A. Irvine
 */
public class A058347 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int k) {
    if (n == 0 || k == 0) {
      return Z.ZERO;
    }
    return Z.ONE.shiftLeft(k + 1).subtract(2).shiftLeft((n - 1) * k)
      .add(Z.valueOf(k - 2).shiftLeft(k).add(2).shiftLeft((n - 1) * (k - 1)))
      .add(Z.ONE.shiftLeft(k).subtract(1).multiply(n - 1).shiftLeft((n - 2) * k + 1))
      .add(get(n - 1, k))
      .add(get(n - 1, k - 1).multiply(Z.ONE.shiftLeft(k).subtract(1)).shiftLeft(n - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}

// T(0, k) = 0, T(n, 0) = 0,
/*
 T(n, k) = (2^(k+1) - 2)2^((n-1) k)
  + 2^((n-1)(k-1))((k-2)2^(k)+2)
  + (n-1) (2^(k) - 1) 2^((n-2)k + 1)
  + T(n-1, k)
 + 2^(n-1)(2^(k)-1) T(n-1, k-1)

 */
