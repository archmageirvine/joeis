package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116818.
 * @author Sean A. Irvine
 */
public class A116818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116818() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 6, 21, 75, 248, 735, 1952});
  }
}
