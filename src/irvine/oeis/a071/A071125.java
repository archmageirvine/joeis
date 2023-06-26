package irvine.oeis.a071;

import irvine.oeis.FiniteSequence;

/**
 * A071125 Least starting number initiating cubefree but nonsquarefree chain of consecutive integers with length n {j,j+1,...,j+n-1}; i.e., start of n consecutive numbers in A067259.
 * @author Georg Fischer
 */
public class A071125 extends FiniteSequence {

  /** Construct the sequence. */
  public A071125() {
    super(1, FINITE, 4, 44, 98, 844, 30923, 671346, 8870025);
  }
}
