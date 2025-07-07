package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078612 Number of transitions necessary for a Turing machine to compute the differences between consecutive primes (primes written in unary), when using the instruction table below.
 * @author Sean A. Irvine
 */
public class A078612 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(p).add(p.multiply2().add(3).multiply(p.add(1)));
  }
}

