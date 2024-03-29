package irvine.oeis.a364;
// Generated by gen_seq4.pl robots/dirichinv at 2023-08-10 08:11

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a005.A005941;

/**
 * A364574 Dirichlet inverse of A005941.
 * @author Georg Fischer
 */
public class A364574 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A005941());

  /** Construct the sequence. */
  public A364574() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
