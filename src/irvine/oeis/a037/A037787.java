package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037787.
 * @author Sean A. Irvine
 */
public class A037787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037787() {
    super(new long[] {-5, 6, -6, 6}, new long[] {3, 17, 85, 426});
  }
}
