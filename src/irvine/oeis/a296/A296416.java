package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296416 Number of non-isomorphic abstract almost-equidistant graphs on n vertices in R^4. A graph G is abstract almost-equidistant in R^4 if the complement of G does not contain K_3 and G does not contain K_6 nor K_{1,3,3}.
 * @author Georg Fischer
 */
public class A296416 extends FiniteSequence {

  /** Construct the sequence. */
  public A296416() {
    super(1, FINITE, 1, 2, 3, 7, 14, 37, 97, 316, 934, 2362, 2814, 944, 59, 4, 1, 1, 0);
  }
}
