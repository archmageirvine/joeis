package irvine.oeis.a364;
// Generated by gen_seq4.pl robots/dirichinv at 2023-12-23 19:12

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;

/**
 * A364952 Dirichlet inverse of A364557, which is M\u00f6bius transform of A005941.
 * @author Georg Fischer
 */
public class A364952 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A364557());

  /** Construct the sequence. */
  public A364952() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
