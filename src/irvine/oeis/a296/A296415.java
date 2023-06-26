package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296415 Number of non-isomorphic abstract almost-equidistant graphs on n vertices in R^3. A graph G is abstract almost-equidistant in R^3 if the complement of G does not contain K_3 and G does not contain K_5 nor K_{3,3}.
 * @author Georg Fischer
 */
public class A296415 extends FiniteSequence {

  /** Construct the sequence. */
  public A296415() {
    super(1, FINITE, 1, 2, 3, 7, 13, 29, 50, 69, 35, 7, 1, 0);
  }
}
