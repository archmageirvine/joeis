package irvine.oeis.a141;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(x^8+3*x^6+x^5+3*x^4+x^3+3*x^2+x+1)/(1-x^2-x^4-2*x^6-x^8)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A141073 List of central integer pairs in Pascal-like triangles with index of asymmetry y = 3 and index of obliqueness z = 0 or z = 1.
 * @author Georg Fischer
 */
public class A141073 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A141073() {
    super(1, "[0,1,1,3,1,3,1,3,0,1]", "[1,0,-1,0,-1,0,-2,0,-1]");
  }
}
