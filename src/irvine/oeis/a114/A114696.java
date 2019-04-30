package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114696 Expansion of <code>(1+4*x+x^2)/((x-1)*(x+1)*(x^2+2*x-1)); a</code> Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A114696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114696() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 6, 15, 40});
  }
}
