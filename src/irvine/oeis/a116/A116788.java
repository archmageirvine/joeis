package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116788.
 * @author Sean A. Irvine
 */
public class A116788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116788() {
    super(new long[] {-2, 13, -32, 39, -25, 8}, new long[] {1, 2, 6, 21, 73, 240});
  }
}
