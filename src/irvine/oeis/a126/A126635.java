package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126635.
 * @author Sean A. Irvine
 */
public class A126635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126635() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {7, 47, 307, 1943, 11827});
  }
}
