package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081684.
 * @author Sean A. Irvine
 */
public class A081684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081684() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {1, -1, -1, 29, 275});
  }
}
