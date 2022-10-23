package irvine.oeis.a048;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048281 Beginning of first run of consecutive quadratic residues mod prime(n) of longest length.
 * @author Sean A. Irvine
 */
public class A048281 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (Z.TWO.equals(mP)) {
      return Z.ZERO;
    }
    long longest = 0;
    long current = 0;
    Z lp = Z.ZERO;
    for (Z q = Z.ONE; q.compareTo(mP) < 0; q = q.add(1)) {
      if (q.jacobi(mP) == 1) {
        ++current;
      } else {
        if (current > longest) {
          lp = q;
          longest = current;
        }
        current = 0;
      }
    }

    // Special wrap around for last value
    Z t = Z.ZERO;
    while (t.isZero() || t.jacobi(mP) == 1) {
      ++current;
      t = t.add(1);
    }

    if (current > longest) {
      lp = t;
      longest = current;
    }

    return mP.add(lp).subtract(longest).mod(mP);
  }
}
