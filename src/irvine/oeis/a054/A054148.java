package irvine.oeis.a054;
// manually 2021-11-15; EFF=0

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A054148 T(2n+1,n), array T as in A054144.
 * O.g.f. (1 - 3*x + 8*x^2 - 8*x^3 + 2*x^4)/(1 - 4*x + 2*x^2)^2
 * @author Georg Fischer
 */
public class A054148 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A054148() {
    super(1, new long[]{0, 1, -3, 8, -8, 2},
      new long[]{1, -8, 20, -16, 4});
  }
}
