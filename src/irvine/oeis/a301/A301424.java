package irvine.oeis.a301;
// manually linmangf/lingf at 2023-02-23 23:42

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A301424 Sums of positive coefficients of generalized Chebyshev polynomials of the first kind, for a family of 7 data.
 * @author Georg Fischer
 */
public class A301424 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301424() {
    super(1, "[0,1,-1,-6,-15,-20,-15,-6,-1]", "[1,-8,-14,-14,0,14,14,6,1]");
  }
}
