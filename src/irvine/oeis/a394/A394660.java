package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394660 allocated for Lei Zhou.
 * @author Sean A. Irvine
 */
public class A394660 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    long q = mP;
    mP = mPrime.nextPrime(mP);
    while (q > 1 && !Predicates.SMOOTH.is(3, mP - q)) {
      q = mPrime.prevPrime(q);
    }
    return q > 1 ? Z.valueOf(q) : Z.ZERO;
  }
}
