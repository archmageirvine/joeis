package irvine.oeis.a063;

import irvine.oeis.FiniteSequence;

/**
 * A063723 Number of vertices in the Platonic solids (in the order tetrahedron, cube, octahedron, dodecahedron, icosahedron).
 * @author Georg Fischer
 */
public class A063723 extends FiniteSequence {

  /** Construct the sequence. */
  public A063723() {
    super(1, FINITE, 4, 8, 6, 20, 12);
  }
}
