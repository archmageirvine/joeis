package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a006.A006882;

/**
 * A057034 Difference between n!! and the first prime before n!! - 1.
 * @author Sean A. Irvine
 */
public class A057034 extends A006882 {

  private final Fast mPrime = new Fast();
  {
    super.next(); // skip 0!!
    super.next(); // skip 1!!
    super.next(); // skip 2!!
    super.next(); // skip 3!!
  }

  @Override
  public Z next() {
    final Z df = super.next();
    return df.subtract(mPrime.prevPrime(df.subtract(1)));
  }
}
