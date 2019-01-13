package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158738.
 * @author Sean A. Irvine
 */
public class A158738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158738() {
    super(new long[] {1, -3, 3}, new long[] {71, 287, 647});
  }
}
