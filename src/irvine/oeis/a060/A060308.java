package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060308 Largest prime &lt;= 2n.
 * @author Sean A. Irvine
 */
public class A060308 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mPrime.prevPrime(mN));
  }
}
