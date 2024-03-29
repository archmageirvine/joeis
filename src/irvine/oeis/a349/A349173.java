package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a003.A003415;
import irvine.oeis.a003.A003959;

/**
 * A349173 Dirichlet convolution of A003415 with A003959, where A003415 is the arithmetic derivative and A003959 is fully multiplicative with a(p) = (p+1).
 * @author Georg Fischer
 */
public class A349173 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A003415(), 0, new A003959(), 1);

  /** Construct the sequence. */
  public A349173() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
