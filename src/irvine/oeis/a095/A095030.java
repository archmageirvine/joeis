package irvine.oeis.a095;

import irvine.oeis.FiniteSequence;

/**
 * A095030 An example of a (v,k,lambda)=(31,6,1) cyclic difference set.
 * @author Georg Fischer
 */
public class A095030 extends FiniteSequence {

  /** Construct the sequence. */
  public A095030() {
    super(1, FINITE, 1, 5, 11, 24, 25, 27);
  }
}
