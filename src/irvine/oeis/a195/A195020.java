package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195020 Vertex number of a square spiral in which the length of the first two edges are the legs of the primitive Pythagorean triple <code>[3, 4, 5]</code>. The edges of the spiral have length <code>A195019</code>.
 * @author Sean A. Irvine
 */
public class A195020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195020() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 7, 13, 21});
  }
}
