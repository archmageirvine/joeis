package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116802.
 * @author Sean A. Irvine
 */
public class A116802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116802() {
    super(new long[] {2, -17, 56, -92, 82, -40, 10}, new long[] {1, 2, 6, 21, 73, 244, 787});
  }
}
