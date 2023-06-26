package irvine.oeis.a282;

import irvine.oeis.FiniteSequence;

/**
 * A282598 Minimal number of cuts along the edges of n-th Platonic solid required to unfold the net of the solid into the plane, in the order tetrahedron, cube, octahedron, dodecahedron, icosahedron.
 * @author Georg Fischer
 */
public class A282598 extends FiniteSequence {

  /** Construct the sequence. */
  public A282598() {
    super(1, FINITE, 3, 7, 5, 19, 11);
  }
}
