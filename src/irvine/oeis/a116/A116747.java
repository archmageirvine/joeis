package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116747.
 * @author Sean A. Irvine
 */
public class A116747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116747() {
    super(new long[] {2, -15, 45, -71, 64, -33, 9}, new long[] {1, 2, 6, 21, 72, 230, 689});
  }
}
