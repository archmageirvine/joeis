package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087289 a(n) = 2^(2*n+1) + 1.
 * @author Sean A. Irvine
 */
public class A087289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087289() {
    super(new long[] {-4, 5}, new long[] {3, 9});
  }
}
