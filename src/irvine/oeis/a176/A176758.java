package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176758.
 * @author Sean A. Irvine
 */
public class A176758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176758() {
    super(new long[] {-4, -2, 4}, new long[] {2, 8, 28});
  }
}
