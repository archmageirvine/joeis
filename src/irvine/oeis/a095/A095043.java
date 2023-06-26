package irvine.oeis.a095;

import irvine.oeis.FiniteSequence;

/**
 * A095043 An example of a (v,k,lambda)=(35,17,8) cyclic difference set.
 * @author Georg Fischer
 */
public class A095043 extends FiniteSequence {

  /** Construct the sequence. */
  public A095043() {
    super(1, FINITE, 0, 1, 3, 4, 7, 9, 11, 12, 13, 14, 16, 17, 21, 27, 28, 29, 33);
  }
}
