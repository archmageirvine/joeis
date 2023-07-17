package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a006.A006882;

/**
 * A057019 Difference between n!! and the first prime after n!! + 1.
 * @author Sean A. Irvine
 */
public class A057019 extends A006882 {

  /** Construct the sequence. */
  public A057019() {
    super(1);
  }

  private final Fast mPrime = new Fast();

  {
    super.next(); // skip 0!!
  }

  @Override
  public Z next() {
    final Z df = super.next();
    return mPrime.nextPrime(df.add(1)).subtract(df);
  }
}
