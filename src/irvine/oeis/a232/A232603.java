package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232603 2^n*sum( k=0..n, k^p*q^k ), where p=2, q=-1/2.
 * @author Sean A. Irvine
 */
public class A232603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232603() {
    super(new long[] {2, 5, 3, -1}, new long[] {0, -1, 2, -5});
  }
}
