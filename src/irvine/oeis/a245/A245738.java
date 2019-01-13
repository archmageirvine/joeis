package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245738.
 * @author Sean A. Irvine
 */
public class A245738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245738() {
    super(new long[] {-1, -1, 2, 1}, new long[] {2, 3, 7, 11});
  }
}
