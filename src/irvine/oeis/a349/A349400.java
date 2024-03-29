package irvine.oeis.a349;
// Generated by gen_seq4.pl robot/dirichinv at 2023-06-17 09:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a064.A064413;

/**
 * A349400 Dirichlet inverse of EKG-permutation, A064413.
 * @author Georg Fischer
 */
public class A349400 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A064413());

  /** Construct the sequence. */
  public A349400() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
