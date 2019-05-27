package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023188.
 * @author Sean A. Irvine
 */
public class A023188 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mD = -1;

  @Override
  public Z next() {
    if (mD < 0) {
      mD = 0;
      return Z.TWO;
    }
    mD += 2;
    long p = 2;
    while (true) {
      final long prev = p;
      p = mPrime.nextPrime(p);
      if (p - prev >= mD) {
        final long next = mPrime.nextPrime(p);
        if (next - p >= mD && (p - prev == mD || next - p == mD)) {
          return Z.valueOf(p);
        }
      }
    }
  }
}

