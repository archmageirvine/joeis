package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;

/**
 * A038027 Least k such that A038025(k)=n-th composite number or 0 if none.
 * @author Sean A. Irvine
 */
public class A038027 extends InverseSequence {

  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A038027() {
    super(new A038025(), 4);
  }

  @Override
  public Z next() {
    while (mPrime.isPrime(mN + 1)) {
      ++mN;
    }
    return super.next();
  }
}
