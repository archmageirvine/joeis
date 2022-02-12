package irvine.oeis.a054;

import irvine.oeis.DistinctSequence;

/**
 * A054642 Distinct values of GCD of divisor sum of primorials and primorial itself: gcd(A002110(n), A000203(A002110(n))).
 * @author Sean A. Irvine
 */
public class A054642 extends DistinctSequence {

  /** Construct the sequence. */
  public A054642() {
    super(new A054641());
  }
}
