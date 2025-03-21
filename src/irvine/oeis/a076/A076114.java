package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076114 a(n) = start of the smallest string of n consecutive positive integers with a square sum, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A076114 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    if ((m & 1) == 0) {
      while ((m & 3) == 0) {
        m >>>= 2;
      }
      if ((m & 1) == 1) {
        return Z.ZERO;
      }
    }
    long k = 0;
    while (!Predicates.SQUARE.is(mN * (mN + 2 * ++k - 1) / 2)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
