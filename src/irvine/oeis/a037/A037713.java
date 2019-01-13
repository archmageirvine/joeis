package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037713.
 * @author Sean A. Irvine
 */
public class A037713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037713() {
    super(new long[] {-8, 9, -9, 9}, new long[] {1, 11, 90, 720});
  }
}
