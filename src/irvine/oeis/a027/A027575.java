package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027575.
 * @author Sean A. Irvine
 */
public class A027575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027575() {
    super(new long[] {1, -3, 3}, new long[] {14, 30, 54});
  }
}
