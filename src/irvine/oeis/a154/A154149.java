package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154149.
 * @author Sean A. Irvine
 */
public class A154149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154149() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {2, 12, 27, 77, 162});
  }
}
