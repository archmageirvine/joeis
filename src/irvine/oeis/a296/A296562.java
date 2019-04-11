package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296562 Numbers k such that <code>k =</code> k_b1 - k_b2, where k_b1 and k_b2 are the representation of k in two different bases <code>b1 &lt; 10</code> and <code>b2 &lt; 10</code>.
 * @author Georg Fischer
 */
public class A296562 extends FiniteSequence {

  /** Construct the sequence. */
  public A296562() {
    super(5, 6, 8, 9, 10, 11, 100, 114, 119, 120, 138, 380, 384, 396, 730, 767, 1509, 4761);
  }
}
