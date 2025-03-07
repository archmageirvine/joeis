package irvine.oeis.a137;
// manually polyx.1a/polyx at 2025-03-05 22:33

import irvine.oeis.PolynomialFieldSequence;

/**
 * A137553 Number of permutations in S_n avoiding {bar 5}{bar 4}231 (i.e., every occurrence of 231 is contained in an occurrence of a 54231).
 * (1+x^2*deriv(A)/A)/(1-x)^2)
 * @author Georg Fischer
 */
public class A137553 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A137553() {
    super(0, "[1, 1]", ";1;x;^2;A;dif;*;A;/;+;1;x;-;^2;/", 0, 0);
    setOffset(1);
  }
}
