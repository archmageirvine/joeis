package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030518 Number of walks of length n between two vertices on a icosahedron at distance 2.
 * @author Sean A. Irvine
 */
public class A030518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030518() {
    super(new long[] {-25, -20, 10, 4}, new long[] {0, 2, 8, 52});
  }
}
