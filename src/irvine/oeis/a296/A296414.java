package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296414 Number of non-isomorphic abstract almost-equidistant graphs on n vertices in R^2. A graph G is abstract almost-equidistant in R^2 if the complement of G does not contain K_3 and G does not contain K_4 nor K_{2,3}.
 * @author Georg Fischer
 */
public class A296414 extends FiniteSequence {

  /** Construct the sequence. */
  public A296414() {
    super(1, 2, 3, 6, 7, 9, 2, 1, 0);
  }
}
