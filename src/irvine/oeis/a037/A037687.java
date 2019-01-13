package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037687.
 * @author Sean A. Irvine
 */
public class A037687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037687() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {1, 10, 103, 1032, 10321});
  }
}
