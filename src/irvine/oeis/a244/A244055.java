package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244055 Number of edges on each face of the Platonic solids (in the order tetrahedron, cube, octahedron, dodecahedron, icosahedron).
 * @author Georg Fischer
 */
public class A244055 extends FiniteSequence {

  /** Construct the sequence. */
  public A244055() {
    super(1, FINITE, 3, 4, 3, 5, 3);
  }
}
