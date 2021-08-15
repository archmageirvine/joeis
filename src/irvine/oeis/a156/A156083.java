package irvine.oeis.a156;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A156083 In this sequence each prime ends a prime century. Place a 0 between the final two digits, and raise the 100s digit by 1, to form the first prime of the next century.
 * @author Sean A. Irvine
 */
public class A156083 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(8779);

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = mPrime.nextPrime(mP);
      final long r = q.mod(1000) / 100;
      if (r == q.mod(100) / 10 - 1 && mP.subtract(q).longValueExact() == 90 - 10 * r) {
        return q;
      }
    }
  }
}
