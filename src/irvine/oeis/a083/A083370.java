package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083370 Primes satisfying f(2p)=p when f(1)=5 (see comment).
 * @author Sean A. Irvine
 */
public class A083370 extends Sequence1 {

  private Z mSum = Z.FIVE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = Functions.GPF.z(mSum);
      mSum = mSum.add(t);
      if ((mN & 1) == 0 && t.equals(mN / 2) && Predicates.PRIME.is(mN / 2)) {
        return Z.valueOf(mN / 2);
      }
    }
  }
}
