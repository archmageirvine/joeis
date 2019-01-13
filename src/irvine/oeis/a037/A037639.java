package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037639.
 * @author Sean A. Irvine
 */
public class A037639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037639() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 11, 45, 182});
  }
}
