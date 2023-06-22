package irvine.oeis.a064;
// manually morfps at 2021-09-20

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A064990 If A_k denotes the first 3^k terms, then A_0 = 0, A_{k+1} = A_k A_k B_k, where B_k is obtained from A_k by interchanging 0's and 1's.
 * Obtained by starting with 0 and iterating the morphism 0 -&gt; 001, 1 -&gt; 110
 * @author Georg Fischer
 */
public class A064990 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A064990() {
    super(0, "0", "0010", "0->001, 1->110");
  }
}
