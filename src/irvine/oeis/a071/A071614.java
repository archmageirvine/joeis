package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A071614 a(n) is the smallest emirp that is the first of n consecutive emirps with equal digit sum.
 * @author Sean A. Irvine
 */
public class A071614 extends A006567 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private Z mP = null;

  @Override
  public Z next() {
    ++mN;
    while (mM < mN) {
      mP = super.next();
      Z q = mP;
      final long s = Functions.DIGIT_SUM.l(q);
      mM = 0;
      do {
        ++mM;
        do {
          q = mPrime.nextPrime(q);
        } while (!Predicates.EMIRP.is(q));
      } while (Functions.DIGIT_SUM.l(q) == s);
    }
    return mP;
  }
}
