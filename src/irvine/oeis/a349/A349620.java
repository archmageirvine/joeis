package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a003.A003415;
import irvine.oeis.a097.A097945;

/**
 * A349620 Dirichlet convolution of A003415 with the Dirichlet inverse of A003958.
 * @author Georg Fischer
 */
public class A349620 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A003415(), 0, new A097945(), 1);

  /** Construct the sequence. */
  public A349620() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
