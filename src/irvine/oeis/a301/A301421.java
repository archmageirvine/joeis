package irvine.oeis.a301;
// manually linmangf/lingf at 2023-02-23 23:42

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A301421 Sums of positive coefficients of generalized Chebyshev polynomials of the first kind, for a family of 6 data.
 * @author Georg Fischer
 */
public class A301421 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301421() {
    super(1, "[0,1,-1,-5,-10,-10,-5,-1]", "[1,-7,-9,-5,5,9,5,1]");
  }
}
