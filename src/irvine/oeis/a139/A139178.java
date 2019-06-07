package irvine.oeis.a139;

import irvine.oeis.FiniteSequence;

/**
 * A139178 Numbers n such that <code>n=(pi(d_1)+pi(d_1!)+pi(d_1!!))+...+ (pi(d_k)+pi(d_k!)+pi(d_k!!))</code> where <code>d_1 d_2 ... d_k</code> is the decimal expansion of <code>n</code>.
 * @author Georg Fischer
 */
public class A139178 extends FiniteSequence {

  /** Construct the sequence. */
  public A139178() {
    super(54, 713, 724, 4348);
  }
}
