package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000584;

/**
 * A053788 Next prime after n^5.
 * @author Sean A. Irvine
 */
public class A053788 extends A000584 {

  private final Fast mPrime = new Fast();
  {
    super.next();
  }

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
