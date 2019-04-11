package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195036 Vertex number of a square spiral in which the length of the first two edges are the legs of the primitive Pythagorean triple <code>[15, 8, 17].</code> The edges of the spiral have length A195035.
 * @author Sean A. Irvine
 */
public class A195036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195036() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 15, 23, 53, 69});
  }
}
