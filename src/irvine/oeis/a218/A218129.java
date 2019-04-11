package irvine.oeis.a218;

import irvine.oeis.FiniteSequence;

/**
 * A218129 2^(((c <code>- 2)^2 +</code> (c <code>- 2))/2) + n = a(n),</code> where c are the positive solutions to {y in N | 2*cos(2*Pi/y) is in Z}; c <code>= {1,2,3,4,6}</code>.
 * @author Georg Fischer
 */
public class A218129 extends FiniteSequence {

  /** Construct the sequence. */
  public A218129() {
    super(1, 2, 4, 11, 1028);
  }
}
