package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.oeis.a004.A004170;

/**
 * A036972 Numbers k such that the k-th prime is a Fibonacci number reversed.
 * @author Sean A. Irvine
 */
public class A036972 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mP = Z.ONE;
  private final A000045 mSeq = new A004170();

  @Override
  public Z next() {
    while (true) {
      final Z r = mSeq.next();
      if (r.isProbablePrime()) {
        while (mP.compareTo(r) > 0) {
          mP = mPrime.prevPrime(mP);
          --mN;
        }
        while (mP.compareTo(r) < 0) {
          mP = mPrime.nextPrime(mP);
          ++mN;
        }
        return Z.valueOf(mN);
      }
    }
  }
}

