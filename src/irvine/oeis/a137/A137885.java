package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137885.
 * @author Sean A. Irvine
 */
public class A137885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137885() {
    super(new long[] {8, -12, 6}, new long[] {144, 576, 1920});
  }
}
