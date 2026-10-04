package irvine.oeis.a086;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086772 Store the natural numbers in a triangular array such that values on each row have the same number of 1 bits. Start a new row with the smallest number not yet recorded. a(n) represents the initial terms in the resulting array.
 * @author Sean A. Irvine
 */
public class A086772 extends Sequence0 {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private Z mLeastUnused = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    final Z res = mLeastUnused;
    Z s = res;
    for (long m = 0; m < mN; ++m) {
      mUsed.add(s);
      do {
        s = Functions.SWIZZLE.z(s);
      } while (!mUsed.add(s));
    }
    return res;
  }
}
