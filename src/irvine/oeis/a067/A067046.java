package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067046.
 * @author Sean A. Irvine
 */
public class A067046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067046() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {1, 2, 10, 10, 35, 28, 84, 60});
  }
}
