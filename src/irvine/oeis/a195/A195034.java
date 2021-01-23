package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195034 Vertex number of a square spiral in which the length of the first two edges are the legs of the primitive Pythagorean triple [21, 20, 29]. The edges of the spiral have length A195033.
 * @author Sean A. Irvine
 */
public class A195034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195034() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 21, 41, 83, 123});
  }
}
