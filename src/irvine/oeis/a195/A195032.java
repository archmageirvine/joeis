package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195032 Vertex number of a square spiral in which the length of the first two edges are the legs of the primitive Pythagorean triple <code>[5, 12, 13]</code>. The edges of the spiral have length A195031.
 * @author Sean A. Irvine
 */
public class A195032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195032() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 17, 27, 51});
  }
}
