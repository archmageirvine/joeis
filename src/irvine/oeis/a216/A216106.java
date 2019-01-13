package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216106.
 * @author Sean A. Irvine
 */
public class A216106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216106() {
    super(new long[] {-1, 4, -6, 4}, new long[] {96, 652, 1968, 4344});
  }
}
