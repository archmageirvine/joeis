package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155624.
 * @author Sean A. Irvine
 */
public class A155624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155624() {
    super(new long[] {33, -47, 15}, new long[] {1, 9, 113});
  }
}
