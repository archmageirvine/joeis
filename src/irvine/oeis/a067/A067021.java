package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a002.A002110;

/**
 * A067021 Largest prime of which the square still does not exceed the product of first n primes, the n-th primorial.
 * @author Sean A. Irvine
 */
public class A067021 extends Sequence2 {

  private final Sequence mPrimorial = new A002110().skip(2);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.prevPrime(mPrimorial.next().sqrt().add(1));
  }
}
