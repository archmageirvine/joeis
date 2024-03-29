package irvine.oeis.a172;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -x*(16*x^9-20*x^8-40*x^7+172*x^6-81*x^5+41*x^4+142*x^3+14*x^2+11*x+1)/(x-1)^5
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A172213 Number of ways to place 4 nonattacking knights on a 4 X n board.
 * @author Georg Fischer
 */
public class A172213 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172213() {
    super(1, "[0,1,11,14,142,41,-81,172,-40,-20,16]", "[1,-5,10,-10,5,-1]");
  }
}
