package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291910 Number of 4-cycles in the n X n rook complement graph.
 * @author Sean A. Irvine
 */
public class A291910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291910() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 9, 576, 6900, 44100, 196245, 686784, 2023056});
  }
}
