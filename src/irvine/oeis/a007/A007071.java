package irvine.oeis.a007;

import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A007071 First row of 2-shuffle of spectral array W( sqrt 2 ).
 * @author Sean A. Irvine
 */
public class A007071 extends MemoryFunction1Sequence<Z> {

  // After R. J. Mathar.

  private int mN = 0;

  private Z wythSpec(final Z n, final CR x) {
    return x.multiply(n).floor();
  }

  private Z a1951(final Z n) {
    return wythSpec(n, CR.SQRT2);
  }

  private Z a1952(final Z n) {
    return a1951(n).add(n.multiply2());
  }

  private Z wSqrt(final long i, final long j) {
    if (j == 1) {
      return a1951(a1951(Z.valueOf(i)));
    } else if (j == 2) {
      return a1952(a1951(Z.valueOf(i)));
    } else if ((j & 1) == 1) {
      return a1951(wSqrt(i, j - 1));
    } else {
      return a1952(wSqrt(i, j - 2));
    }
  }

  @Override
  protected Z compute(final int n) {
    if (n <= 1) {
      return Z.ONE;
    }
    Z a = get(n - 1);
    while (true) {
      a = a.add(1);
      for (int j = 1; j <= 2; ++j) {
        int c;
        int k = 0;
        while ((c = wSqrt(++k, j).compareTo(a)) <= 0) {
          if (c == 0) {
            return a;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    return get(++mN);
  }
}
