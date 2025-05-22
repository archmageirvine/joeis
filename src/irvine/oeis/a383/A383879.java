package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;
import irvine.util.string.StringUtils;

/**
 * A383879 a(n) is the smallest integer k such that the Diophantine equation x^3 + y^3 + z^3 + w^3 = k^n, where 0 &lt; x &lt; y &lt; z &lt; w has exactly n integer solutions.
 * @author Sean A. Irvine
 */
public class A383879 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicArray<Z> mCubes = new LongDynamicArray<>();
  private long mN = 0;
  {
    mCubes.set(0, Z.ZERO);
    mCubes.set(1, Z.ONE);
    mCubes.set(2, Z.EIGHT);
    mCubes.set(3, Z.valueOf(27));
  }

  private Z cube(final long n) {
    if (n >= mCubes.length()) {
      mCubes.set(n, Z.valueOf(n).pow(3));
    }
    return mCubes.get(n);
  }

  private boolean is(final long k) {
    final Z kn = Z.valueOf(k).pow(mN);
    long cnt = 0;
    Z w3;
    for (long w = kn.divide(4).root(3).longValueExact(); (w3 = kn.subtract(cube(w))).signum() > 0; ++w) {
      Z z3;
      for (long z = w3.divide(3).root(3).longValue(); z < w && (z3 = w3.subtract(cube(z))).signum() > 0; ++z) {
        Z y3;
        for (long y = z3.divide2().root(3).longValue(); y < z && (y3 = z3.subtract(cube(y))).signum() > 0; ++y) {
          final Z x = y3.root(3);
          if (x.auxiliary() == 1 && x.compareTo(y) < 0 && ++cnt > mN) {
            return false;
          }
        }
      }
    }
    return cnt == mN;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 3;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 50 == 0) {
        StringUtils.message("n=" + mN + " searched to k=" + k);
      }
    }
  }
}
