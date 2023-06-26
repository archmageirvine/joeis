package irvine.oeis.a157;

import irvine.oeis.FiniteSequence;

/**
 * A157989 The numbers of the jingle for a popular Ontario pizza chain's phone number. Sung as: "nine, six, seven, eleven, eleven, .... " Jingle first introduced in 1978 and has since become a pop culture item for Canadians.
 * @author Georg Fischer
 */
public class A157989 extends FiniteSequence {

  /** Construct the sequence. */
  public A157989() {
    super(1, FINITE, 9, 6, 7, 11, 11);
  }
}
