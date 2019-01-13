package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000978.
 * @author Sean A. Irvine
 */
public class A000978 implements Sequence {

  private static final long[] KNOWN_CASES = {3, 5, 7, 11, 13, 17, 19, 23, 31, 43, 61, 79, 101, 127, 167, 191, 199, 313, 347, 701, 1709, 2617, 3539, 5807, 10501, 10691, 11279, 12391, 14479, 42737, 83339, 95369, 117239, 127031, 138937, 141079, 267017, 269987, 374321, 986191, 4031399};

  private int mPos = 0;

  private final Fast mPrime = new Fast();
  private long mP = KNOWN_CASES[KNOWN_CASES.length - 1];

  @Override
  public Z next() {
    if (mPos < KNOWN_CASES.length) {
      return Z.valueOf(KNOWN_CASES[mPos++]);
    }
    // There is virtually no chance of the following finding a new one ...
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.ONE.shiftLeft((int) mP).add(1).divide(3).isProbablePrime(10)) {
        return Z.valueOf(mP);
      }
    }
  }
}
