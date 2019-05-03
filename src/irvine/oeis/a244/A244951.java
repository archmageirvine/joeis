package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244951 Minimum number of colors needed to color the faces of the Platonic solids such that no two faces meeting at a common edge share the same color (in the order tetrahedron, cube, octahedron, dodecahedron, icosahedron).
 * @author Georg Fischer
 */
public class A244951 extends FiniteSequence {

  /** Construct the sequence. */
  public A244951() {
    super(4, 3, 2, 4, 3);
  }
}
