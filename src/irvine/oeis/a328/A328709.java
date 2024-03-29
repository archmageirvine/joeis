package irvine.oeis.a328;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a050.A050367;
import irvine.oeis.a050.A050368;

/**
 * A328709 Dirichlet g.f.: Product_{k&gt;=2} ((1 + k^(-s)) / (1 - k^(-s)))^k.
 * @author Georg Fischer
 */
public class A328709 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A050367(), 1, new A050368(), 1);

  /** Construct the sequence. */
  public A328709() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
