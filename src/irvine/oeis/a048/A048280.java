package irvine.oeis.a048;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048280 Length of longest run of consecutive quadratic residues mod prime(n).
 * @author Sean A. Irvine
 */
public class A048280 extends Sequence1 {

  // Differs from A002307 in that it allows wrap around

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long longest = 0;
    long current = 0;
    for (Z q = Z.ONE; q.compareTo(mP) < 0; q = q.add(1)) {
      if (q.jacobi(mP) == 1) {
        ++current;
      } else {
        if (current > longest) {
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
      longest = current;
    }

    return Z.valueOf(longest).min(mP);
  }
}
