package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002146 Smallest prime <code>== 7 mod 8</code> where Q(sqrt -p) has class number <code>2n+1</code>.
 * @author Sean A. Irvine
 */
public class A002146 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long p = 5;
    while (true) {
      p = mPrime.nextPrime(p);
      if ((p & 7) == 7 && LongUtils.classNumber(-p) == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
