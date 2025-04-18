package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-01-03.ack/dirichcon2 at 2025-01-06 00:11

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a003.A003961;
import irvine.oeis.a046.A046692;

/**
 * A378606 Dirichlet convolution of A046692 and A003961, where A046692 is the Dirichlet inverse of sigma, and A003961 is fully multiplicative with a(prime(i)) = prime(i+1).
 * @author Georg Fischer
 */
public class A378606 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A046692(), 1, new A003961(), 1);

  /** Construct the sequence. */
  public A378606() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
