package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053016 Numbers of vertices of Platonic solids in the order tetrahedron, octahedron, cube, icosahedron, dodecahedron. Equally, numbers of faces of Platonic solids in the order tetrahedron, cube, octahedron, dodecahedron, icosahedron.
 * @author Georg Fischer
 */
public class A053016 extends FiniteSequence {

  /** Construct the sequence. */
  public A053016() {
    super(4, 6, 8, 12, 20);
  }
}
