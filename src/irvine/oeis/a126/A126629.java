package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126629.
 * @author Sean A. Irvine
 */
public class A126629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126629() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {8, 64, 506, 3916, 29498, 215524});
  }
}
