package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296415 Number of non-isomorphic abstract almost-equidistant graphs on n vertices in <code>R^3</code>. A graph G is abstract almost-equidistant in <code>R^3</code> if the complement of G does not contain <code>K_3</code> and G does not contain <code>K_5</code> nor <code>K_{3,3}</code>.
 * @author Georg Fischer
 */
public class A296415 extends FiniteSequence {

  /** Construct the sequence. */
  public A296415() {
    super(1, 2, 3, 7, 13, 29, 50, 69, 35, 7, 1, 0);
  }
}
