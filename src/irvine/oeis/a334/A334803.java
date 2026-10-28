package irvine.oeis.a334;

import irvine.oeis.FiniteSequence;

/**
 * A334803 Numbers k such that k*p is divisible by k+p and k-p, where k &gt; p &gt; 0 and p = A007954(k) = the product of digits of k.
 * @author Sean A. Irvine
 */
public class A334803 extends FiniteSequence {

  /** Construct the sequence. */
  public A334803() {
    super(1, FINITE, 24, 36, 3276, 1886976);
  }
}
