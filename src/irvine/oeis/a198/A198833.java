package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198833.
 * @author Sean A. Irvine
 */
public class A198833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198833() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 10, 56, 220, 680, 1771, 4060});
  }
}
