package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046116 Numbers k such that no Paley-type Hadamard matrix of order k exists.
 * @author Sean A. Irvine
 */
public class A046116 extends Sequence1 {

  private long mN = 88;

  private boolean is(long m) {
    while ((m & 1) == 0) {
      final Z q = Z.valueOf(m - 1);
      if (q.isProbablePrime()) {
        return false;
      }
      if (Predicates.PRIME_POWER.is(q)) {
        return false;
      }
      m >>>= 1;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
