package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014210 Next prime after 2^n.
 * @author Sean A. Irvine
 */
public class A014210 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    return mPrime.nextPrime(Z.ONE.shiftLeft(++mN));
  }
}
