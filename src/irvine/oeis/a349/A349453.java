package irvine.oeis.a349;
// manually deris/dirichinv at 2022-10-26 11:22

import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a133.A133494;

/**
 * A349453 Dirichlet inverse of A133494, 3^(n-1).
 * @author Georg Fischer
 */
public class A349453 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A349453() {
    super(new A133494().skip(1));
  }
}
