package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126639.
 * @author Sean A. Irvine
 */
public class A126639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126639() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {7, 49, 331, 2137, 13147});
  }
}
