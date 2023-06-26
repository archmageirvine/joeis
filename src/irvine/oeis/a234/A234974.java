package irvine.oeis.a234;

import irvine.oeis.FiniteSequence;

/**
 * A234974 Expected lengths of random walks along the edges of a Platonic solid (in the order cube, octahedron, dodecahedron, icosahedron) from one vertex to an opposing one.
 * @author Georg Fischer
 */
public class A234974 extends FiniteSequence {

  /** Construct the sequence. */
  public A234974() {
    super(1, FINITE, 10, 6, 35, 15);
  }
}
