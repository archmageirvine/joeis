package irvine.oeis.a063;

import irvine.oeis.FiniteSequence;

/**
 * A063722 Number of edges in the Platonic solids (in the order tetrahedron, cube, octahedron, dodecahedron, icosahedron).
 * @author Georg Fischer
 */
public class A063722 extends FiniteSequence {

  /** Construct the sequence. */
  public A063722() {
    super(6, 12, 12, 30, 30);
  }
}
