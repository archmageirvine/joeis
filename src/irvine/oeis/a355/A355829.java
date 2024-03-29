package irvine.oeis.a355;
// Generated by gen_seq4.pl deris/dirichinv at 2022-10-26 15:17
// DO NOT EDIT here!

import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a009.A009194;

/**
 * A355829 Dirichlet inverse of A009194, the greatest common divisor of sigma(n) and n, where sigma is the sum of divisors function.
 * @author Georg Fischer
 */
public class A355829 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A355829() {
    super(new A009194());
  }
}
