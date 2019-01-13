package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116833.
 * @author Sean A. Irvine
 */
public class A116833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116833() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 6, 21, 71, 213, 564, 1340});
  }
}
