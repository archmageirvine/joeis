package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395617 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A395617 extends Sequence1 {

  private Z mSum = null;

  private boolean is(final Z[] d, final int pos, final Z sum) {
    for (int k = pos; k < d.length; ++k) {
      final Z t = sum.subtract(d[k]);
      final int s = t.signum();
      if (s <= 0) {
        return s == 0;
      }
      if (is(d, k + 1, sum.subtract(d[k]))) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long k) {
    final int c = Functions.SIGMA1.z(k).compareTo(mSum);
    if (c <= 0) {
      return c == 0;
    }
    final Z[] d = Jaguar.factor(k).divisorsSorted();
    return is(d, 0, mSum);
  }

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return mSum;
    }
    long k = 0;
    while (true) {
      if (is(++k)) {
        mSum = mSum.add(k);
        return Z.valueOf(k);
      }
    }
  }
}
