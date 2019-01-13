package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018921.
 * @author Sean A. Irvine
 */
public class A018921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018921() {
    super(new long[] {-1, 0, 0, 2}, new long[] {4, 8, 15, 28});
  }
}
