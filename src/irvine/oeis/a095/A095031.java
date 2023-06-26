package irvine.oeis.a095;

import irvine.oeis.FiniteSequence;

/**
 * A095031 An example of a (v,k,lambda)=(15,7,3) cyclic difference set.
 * @author Georg Fischer
 */
public class A095031 extends FiniteSequence {

  /** Construct the sequence. */
  public A095031() {
    super(1, FINITE, 0, 1, 2, 4, 5, 8, 10);
  }
}
