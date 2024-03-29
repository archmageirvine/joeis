package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000027;

/**
 * A349442 Dirichlet convolution of A000027 (the identity function) with A349350 (Dirichlet inverse of the powerful part of n).
 * @author Georg Fischer
 */
public class A349442 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000027(), 1, new A349350(), 1);

  /** Construct the sequence. */
  public A349442() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
