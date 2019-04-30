package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114647 Expansion of <code>(-3+4*x+3*x^2)/((1-x)*(x+1)*(x^2+2*x-1)); a</code> Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A114647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114647() {
    super(new long[] {-1, -2, 2, 2}, new long[] {3, 2, 7, 12});
  }
}
