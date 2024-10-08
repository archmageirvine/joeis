package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A062568 a(n) is the smallest n-digit strong pseudoprime (in base 2).
 * @author Sean A. Irvine
 */
public class A062568 extends AbstractSequence {

  private Z mT = Z.valueOf(100);
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A062568() {
    super(4);
  }

  @Override
  public Z next() {
    mT = mT.multiply(10);
    Z n = mT.subtract(1);
    while (true) {
      n = n.add(2);
      if (!mPrime.isPrime(n) && Predicates.STRONG_PSEUDOPRIME.is(2L, n)) {
        return n;
      }
    }
  }
}
