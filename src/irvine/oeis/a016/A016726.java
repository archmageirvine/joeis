package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016726 Smallest k such that <code>1, 4, 9</code>, ..., <code>n^2</code> are distinct mod k.
 * @author Sean A. Irvine
 */
public class A016726 implements Sequence {

  private static final int[] SMALL = {1, 2, 6, 9};
  private final Fast mPrime = new Fast();

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    }
    return Z.valueOf(Math.min(mPrime.nextPrime(2 * mN + 1), 2 * mPrime.nextPrime(mN)));
  }
}
