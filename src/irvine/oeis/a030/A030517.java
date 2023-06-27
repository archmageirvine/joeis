package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030517 Number of walks of length n between two vertices on an icosahedron at distance 1.
 * @author Sean A. Irvine
 */
public class A030517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030517() {
    super(1, new long[] {-25, -20, 10, 4}, new long[] {1, 2, 13, 52});
  }
}
