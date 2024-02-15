package irvine.oeis.a068;

import irvine.oeis.FilterSequence;

/**
 * A068355 Odd n such that sigma(n)*tau(n)&gt;prime(2*n) where sigma(n) is the sum of divisors of n and tau(n) the number of divisors of n = A000005(n).
 * @author Sean A. Irvine
 */
public class A068355 extends FilterSequence {

  /** Construct the sequence. */
  public A068355() {
    super(new A068354(), ODD);
  }
}
