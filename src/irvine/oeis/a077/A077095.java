package irvine.oeis.a077;

import irvine.oeis.FiniteSequence;

/**
 * A077095 Starting iteration of <code>Phi[]*(Sigma[]-Phi[])</code> function at these initial values leads to the fixed point 24.
 * @author Georg Fischer
 */
public class A077095 extends FiniteSequence {

  /** Construct the sequence. */
  public A077095() {
    super(24, 42, 69, 74, 75, 82, 86, 94, 115, 125, 133, 155, 185, 187, 203, 289, 299, 323, 341, 361, 377, 437, 1681);
  }
}
