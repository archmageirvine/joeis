package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116793.
 * @author Sean A. Irvine
 */
public class A116793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116793() {
    super(new long[] {1, -3, 11, -12, 6}, new long[] {1, 2, 6, 21, 74});
  }
}
