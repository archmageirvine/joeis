package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126634.
 * @author Sean A. Irvine
 */
public class A126634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126634() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {6, 36, 216, 1296, 7656});
  }
}
