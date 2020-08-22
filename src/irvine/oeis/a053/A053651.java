package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053651 Number of nonisomorphic cyclic subgroups of general linear group GL(n,2).
 * @author Georg Fischer
 */
public class A053651 extends FiniteSequence {

  /** Construct the sequence. */
  public A053651() {
    super(1, 3, 5, 8, 13, 18, 27, 37, 51, 70, 96, 130, 176, 232);
  }
}
