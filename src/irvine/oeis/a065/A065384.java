package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065384 Largest prime &lt;= n * (n + 1) / 2.
 * @author Sean A. Irvine
 */
public class A065384 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    return mPrime.prevPrime(Z.valueOf(++mN).multiply(mN + 1).divide2().add(1));
  }
}
