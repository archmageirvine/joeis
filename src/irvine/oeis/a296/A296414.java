package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296414 Number of non-isomorphic abstract almost-equidistant graphs on n vertices in <code>R^2</code>. A graph G is abstract almost-equidistant in <code>R^2</code> if the complement of G does not contain <code>K_3</code> and G does not contain <code>K_4</code> nor <code>K_{2,3}</code>.
 * @author Georg Fischer
 */
public class A296414 extends FiniteSequence {

  /** Construct the sequence. */
  public A296414() {
    super(1, 2, 3, 6, 7, 9, 2, 1, 0);
  }
}
