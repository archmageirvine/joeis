package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116816.
 * @author Sean A. Irvine
 */
public class A116816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116816() {
    super(new long[] {-2, 12, -28, 35, -24, 8}, new long[] {1, 2, 6, 21, 75, 260});
  }
}
