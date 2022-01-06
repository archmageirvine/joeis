package irvine.oeis.a048;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A048458 'Prime last odd terms' from generation 2 onwards.
 * @author Sean A. Irvine
 */
public class A048458 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A048458() {
    super(new A048457());
  }
}
