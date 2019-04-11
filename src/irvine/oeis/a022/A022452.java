package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022452 Expansion of <code>1/((1-x)*(1-5*x)*(1-7*x)*(1-8*x))</code>.
 * @author Sean A. Irvine
 */
public class A022452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022452() {
    super(new long[] {-280, 411, -151, 21}, new long[] {1, 21, 290, 3330});
  }
}
