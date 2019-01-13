package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A079405.
 * @author Sean A. Irvine
 */
public class A079405 implements Sequence {

  private static final int[] BRAILLE_DOTS = {3, 1, 2, 2, 3, 2, 3, 4, 3, 2};

  private long mP = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long v = mP;
    long dots = 0;
    while (v != 0) {
      dots += BRAILLE_DOTS[(int) (v % 10)];
      v /= 10;
    }
    return Z.valueOf(dots);
  }
}

