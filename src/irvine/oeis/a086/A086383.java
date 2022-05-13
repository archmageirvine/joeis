package irvine.oeis.a086;

import irvine.oeis.a000.A000129;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A086383 Prime terms in the sequence of Pell numbers, A000129.
 * @author Sean A. Irvine
 */
public class A086383 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A086383() {
    super(new A000129());
  }
}

