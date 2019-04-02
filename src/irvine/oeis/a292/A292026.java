package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292026 Wiener index of the n-Sierpinski tetrahedron graph.
 * @author Sean A. Irvine
 */
public class A292026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292026() {
    super(new long[] {-2048, 1856, -504, 46}, new long[] {6, 66, 1476, 42984});
  }
}
