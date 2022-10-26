package irvine.oeis.a349;
// manually deris/dirichinv at 2022-10-26 11:22

import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A349451 Dirichlet inverse of Fibonacci numbers, when started from A000045(1): 1, 1, 2, 3, 5, 8, 13, 21, ...
 * @author Georg Fischer
 */
public class A349451 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A349451() {
    super(new SkipSequence(new A000045(), 1));
  }
}
