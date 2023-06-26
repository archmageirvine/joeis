package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024785 Left-truncatable primes: every suffix is prime and no digits are zero.
 * @author Sean A. Irvine
 */
public class A024785 extends FiniteSequence {

  /** Construct the sequence. */
  public A024785() {
    super(1, FINITE, A024781.build(10));
  }
}
