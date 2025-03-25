package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006882;

/**
 * A057019 Difference between n!! and the first prime after n!! + 1.
 * @author Sean A. Irvine
 */
public class A057019 extends Sequence1 {

  private final Sequence mA = new A006882().skip();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z df = mA.next();
    return mPrime.nextPrime(df.add(1)).subtract(df);
  }
}
