package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280293.
 * @author Sean A. Irvine
 */
public class A280293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280293() {
    super(new long[] {-2, 1, 2}, new long[] {3, 1, 6});
  }
}
