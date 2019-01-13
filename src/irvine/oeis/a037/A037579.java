package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037579.
 * @author Sean A. Irvine
 */
public class A037579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037579() {
    super(new long[] {-7, 1, 7}, new long[] {1, 10, 71});
  }
}
