package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076115 Squares (or 0) from A076114.
 * @author Sean A. Irvine
 */
public class A076115 extends Sequence1 {

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
    while (true) {
      final long t = mN * (mN + 2 * ++k - 1) / 2;
      if (Predicates.SQUARE.is(t)) {
        return Z.valueOf(t);
      }
    }
  }
}
