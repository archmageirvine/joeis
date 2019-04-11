package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097165 Expansion of <code>(1-3x)/((1-x)(1-4x)(1-5x))</code>.
 * @author Sean A. Irvine
 */
public class A097165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097165() {
    super(new long[] {20, -29, 10}, new long[] {1, 7, 41});
  }
}
