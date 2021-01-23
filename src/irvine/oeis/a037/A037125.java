package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037125 Irregular triangle: row n is 1, 2, 3, 4, .., prime(n).
 * @author Sean A. Irvine
 */
public class A037125 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN > mP) {
      mP = mPrime.nextPrime(mP);
      mN = 1;
    }
    return Z.valueOf(mN);
  }
}
