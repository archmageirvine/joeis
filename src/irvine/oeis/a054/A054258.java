package irvine.oeis.a054;

import irvine.oeis.IntersectionSequence;

/**
 * A054258 Concatenation of n in base 2 up to base 10 and n in base 10 down to base 2 is prime, all numbers are interpreted as decimals.
 * @author Sean A. Irvine
 */
public class A054258 extends IntersectionSequence {

  /** Construct the sequence. */
  public A054258() {
    super(new A054256(), new A054257());
    mOffset = 0;
  }
}
