package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024073 <code>a(n) = 6^n - n^11</code>.
 * @author Sean A. Irvine
 */
public class A024073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024073() {
    super(new long[] {6, -73, 408, -1386, 3190, -5247, 6336, -5676, 3762, -1815, 616, -138, 18}, new long[] {1, 5, -2012, -176931, -4193008, -48820349, -362750400, -1977046807, -8588254976L, -31370981913L, -99939533824L, -284948873555L, -740831588352L});
  }
}
