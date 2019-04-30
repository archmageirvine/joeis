package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001390 Smallest multiplicative generator for quadratic residues <code>mod prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A001390 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (mP <= 3) {
      return Z.ONE;
    }
    final long numQR = (mP + 1) / 2;
    long g = 1;
    while (true) {
      if (LongUtils.jacobi(++g, mP) == 1) {
        long c = 2; // Allow for 0 and 1
        long s = g;
        do {
          if (++c > numQR) {
            break;
          }
          s *= g;
          s %= mP;
        } while (s != 1);
        if (c == numQR) {
          return Z.valueOf(g);
        }
      }
    }
  }
}
