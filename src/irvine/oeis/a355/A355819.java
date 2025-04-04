package irvine.oeis.a355;
// Generated by gen_seq4.pl 2024-12-01.ack/dirichinv at 2024-12-01 23:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a270.A270419;

/**
 * A355819 Dirichlet inverse of A270419, denominator of the rational number obtained when the exponents in prime factorization of n are reinterpreted as alternating binary sums (A065620).
 * @author Georg Fischer
 */
public class A355819 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A270419());

  /** Construct the sequence. */
  public A355819() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
