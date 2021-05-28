package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114697 Expansion of (1+x+x^2)/((1-x^2)*(1-2*x-x^2)); a Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A114697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114697() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 3, 9, 22});
  }
}
