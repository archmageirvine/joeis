package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200783 G.f.: 1/(1-7*x+35*x^3-35*x^4+7*x^6-x^7).
 * @author Sean A. Irvine
 */
public class A200783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200783() {
    super(new long[] {1, -7, 0, 35, -35, 0, 7}, new long[] {1, 7, 49, 308, 1946, 12152, 75992});
  }
}
