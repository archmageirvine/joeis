package irvine.oeis.a068;

import irvine.oeis.FilterSequence;

/**
 * A068355 Odd numbers k such that sigma(k)*tau(k) &gt; prime(2*k), where sigma(k) is the sum of divisors of k and tau(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A068355 extends FilterSequence {

  /** Construct the sequence. */
  public A068355() {
    super(new A068354(), ODD);
  }
}
