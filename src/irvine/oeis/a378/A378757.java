package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-10.ack/dirichcon2 at 2025-02-10 21:26

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a346.A346237;

/**
 * A378757 Dirichlet convolution of sigma and the Dirichlet inverse of A005187 (A346237).
 * @author Georg Fischer
 */
public class A378757 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000203(), 1, new A346237(), 1);

  /** Construct the sequence. */
  public A378757() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
