package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-22.ack/dirichcon2 at 2025-05-22 22:55

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a055.A055615;
import irvine.oeis.a276.A276086;

/**
 * A383286 Dirichlet convolution of A276086 (primorial base exp-function) with A055615 (Dirichlet inverse of n).
 * @author Georg Fischer
 */
public class A383286 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A276086(), 0, new A055615(), 1);

  /** Construct the sequence. */
  public A383286() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
