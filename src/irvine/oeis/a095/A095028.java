package irvine.oeis.a095;

import irvine.oeis.FiniteSequence;

/**
 * A095028 An example of a (v,k,lambda)=(11,5,2) cyclic difference set.
 * @author Georg Fischer
 */
public class A095028 extends FiniteSequence {

  /** Construct the sequence. */
  public A095028() {
    super(1, FINITE, 1, 3, 4, 5, 9);
  }
}
