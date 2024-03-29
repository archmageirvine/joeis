package irvine.oeis.a354;
// Generated by gen_seq4.pl robots/dirichinv at 2023-11-09 11:57

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a238.A238745;

/**
 * A354826 Dirichlet inverse of A238745.
 * @author Georg Fischer
 */
public class A354826 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A238745());

  /** Construct the sequence. */
  public A354826() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
