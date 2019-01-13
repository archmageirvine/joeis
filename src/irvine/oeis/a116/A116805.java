package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116805.
 * @author Sean A. Irvine
 */
public class A116805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116805() {
    super(new long[] {-2, 12, -29, 36, -24, 8}, new long[] {1, 2, 6, 21, 74, 256});
  }
}
