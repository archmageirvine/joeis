package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000057.
 * @author Sean A. Irvine
 */
public class A000057 implements Sequence {

  private long mN = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      Z a = Z.ZERO;
      Z b = Z.ONE;
      long k = 0;
      boolean ok = true;
      while (++k <= mN) {
        final Z t = a.add(b);
        a = b;
        b = t;
        if (t.mod(mN) == 0) {
          ok = k == mN;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

