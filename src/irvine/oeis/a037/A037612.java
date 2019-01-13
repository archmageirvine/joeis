package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037612.
 * @author Sean A. Irvine
 */
public class A037612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037612() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 8, 42, 211});
  }
}
