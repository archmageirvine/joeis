package irvine.oeis.a005;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A005770 Number of convex polygons of length <code>2n</code> on square lattice whose leftmost bottom vertex and rightmost top vertex have the same <code>x-coordinate</code>.
 * @author Sean A. Irvine
 */
public class A005770 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A005770() {
    super(new long[] {1, -3, 2, 1},
      new long[] {1, -12, 55, -120, 125, -54, 8});
  }
}
