package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-07-11/dirichinv at 2024-07-11 18:00

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a110.A110963;

/**
 * A353366 Dirichlet inverse of A110963, which is a fractalization of Kimberling's paraphrases sequence (A003602).
 * @author Georg Fischer
 */
public class A353366 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A110963());

  /** Construct the sequence. */
  public A353366() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
