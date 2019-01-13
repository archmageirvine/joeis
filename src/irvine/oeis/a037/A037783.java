package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037783.
 * @author Sean A. Irvine
 */
public class A037783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037783() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {3, 25, 202, 1616, 12931});
  }
}
