package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097830.
 * @author Sean A. Irvine
 */
public class A097830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097830() {
    super(new long[] {1, -17, 17}, new long[] {1, 17, 272});
  }
}
