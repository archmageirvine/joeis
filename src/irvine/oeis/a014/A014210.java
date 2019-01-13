package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014210.
 * @author Sean A. Irvine
 */
public class A014210 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    return mPrime.nextPrime(Z.ONE.shiftLeft(++mN));
  }
}
