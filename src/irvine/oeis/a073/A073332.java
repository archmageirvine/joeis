package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002034;

/**
 * A073259.
 * @author Sean A. Irvine
 */
public class A073332 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mA = new A002034().skip();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (!mPrime.isPrime(++mN) && t.equals(Functions.SQUARE_FREE_KERNEL.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

