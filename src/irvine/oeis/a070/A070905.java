package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A070905 Smallest prime (emirp) of n consecutive primes such that all are emirps and all have the same digital sum.
 * @author Sean A. Irvine
 */
public class A070905 extends A006567 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(Z p) {
    final long s = Functions.DIGIT_SUM.l(p);
    for (int k = 1; k < mN; ++k) {
      p = Functions.NEXT_PRIME.z(p);
      if (!Predicates.EMIRP.is(p)) {
        return false;
      }
      if (Functions.DIGIT_SUM.l(p) != s) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mP)) {
        return mP;
      }
      mP = super.next();
    }
  }
}
