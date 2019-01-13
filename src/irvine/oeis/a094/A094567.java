package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094567.
 * @author Sean A. Irvine
 */
public class A094567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094567() {
    super(new long[] {-1, 6, 6}, new long[] {1, 4, 30});
  }
}
