package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074070 Number of Paley classes of Hadamard matrices of order 4n.
 * @author Sean A. Irvine
 */
public class A074070 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    long cnt = 0;
    long m = mN;
    while ((m & 1) == 0) {
      final Z q = Z.valueOf(m - 1);
      if (m == 2 || q.isProbablePrime()) {
        ++cnt;
      } else if (Predicates.PRIME_POWER.is(q)) {
        ++cnt;
      }
      m >>>= 1;
    }
    return Z.valueOf(cnt);
  }
}
