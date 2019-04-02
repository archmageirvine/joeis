package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232604 2^n*sum( k=0..n, k^p*q^k ), where p=3, q=-1/2.
 * @author Sean A. Irvine
 */
public class A232604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232604() {
    super(new long[] {2, 7, 8, 2, -2}, new long[] {0, -1, 6, -15, 34});
  }
}
