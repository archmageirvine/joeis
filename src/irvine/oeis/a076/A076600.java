package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076600 a(n) = smallest k &gt; n such that n^2 + k^2 is a square, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A076600 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    final Z s = Z.valueOf(mN).square();
    final Z lim = s.divide2().add(1);
    while (true) {
      final Z mz = Z.valueOf(++m);
      if (mz.compareTo(lim) > 0) {
        return Z.ZERO;
      }
      if (Predicates.SQUARE.is(s.add(mz.square()))) {
        return mz;
      }
    }
  }
}
