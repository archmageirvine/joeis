package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014234 Largest prime &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A014234 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    return mPrime.prevPrime(Z.ONE.shiftLeft(++mN).add(1));
  }
}
