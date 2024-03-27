package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068969 Areas of integer Heronian triangles [A068967(n), prime(A068967(n)), A068968(n)].
 * @author Sean A. Irvine
 */
public class A068969 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mA = 1;
  private long mB = 2;

  @Override
  public Z next() {
    while (true) {
      ++mA;
      mB = mPrime.nextPrime(mB);
      for (long c = mA + 1; c < mA + mB; ++c) {
        final long s2 = mA + mB + c;
        final Z delta = Z.valueOf(s2).multiply(s2 - 2 * mA).multiply(s2 - 2 * mB).multiply(s2 - 2 * c);
        if (delta.signum() > 0 && delta.mod(16) == 0) {
          final Z[] d = delta.shiftRight(4).sqrtAndRemainder();
          if (d[1].isZero()) {
            return d[0];
          }
        }
      }
    }
  }
}
