package irvine.oeis.a361;
// manually dirichcon/dirichinv at 2023-06-04 19:59

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010060;

/**
 * A361017 Dirichlet inverse of Thue-Morse sequence, A010060.
 * @author Georg Fischer
 */
public class A361017 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new SkipSequence(new A010060(), 1));

  /** Construct the sequence. */
  public A361017() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
