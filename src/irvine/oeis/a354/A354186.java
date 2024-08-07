package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-07-31/dirichinv at 2024-07-31 22:55

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a348.A348717;

/**
 * A354186 Dirichlet inverse of A348717.
 * @author Georg Fischer
 */
public class A354186 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A348717());

  /** Construct the sequence. */
  public A354186() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
