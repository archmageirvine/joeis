package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126640.
 * @author Sean A. Irvine
 */
public class A126640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126640() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {8, 60, 422, 2784, 17318});
  }
}
