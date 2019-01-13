package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055843.
 * @author Sean A. Irvine
 */
public class A055843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055843() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 13, 85, 385, 1375, 4147, 11011, 26455, 58630, 121550});
  }
}
