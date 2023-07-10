package irvine.oeis.a323;
// manually 2023-07-10

import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a064.A064664;

/**
 * A323411 Dirichlet inverse of A064664, the inverse permutation of EKG-sequence.
 * @author Georg Fischer
 */
public class A323411 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A323411() {
    super(1, new A064664());
  }
}
