package irvine.oeis.a346;
// Generated by gen_seq4.pl robots/dirichinv at 2023-11-09 11:57

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a341.A341530;

/**
 * A346235 Dirichlet inverse of A341530, gcd(n*sigma(A003961(n)), sigma(n)*A003961(n)).
 * @author Georg Fischer
 */
public class A346235 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A341530());

  /** Construct the sequence. */
  public A346235() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
