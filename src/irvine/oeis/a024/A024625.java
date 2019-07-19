package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A024625.
 * @author Sean A. Irvine
 */
public class A024625 extends A000961 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z p3 = mP.pow(3);
    while (true) {
      ++mN;
      if (super.next().equals(p3)) {
        return Z.valueOf(mN);
      }
    }
  }
}
