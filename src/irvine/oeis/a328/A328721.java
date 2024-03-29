package irvine.oeis.a328;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000688;
import irvine.oeis.a050.A050361;

/**
 * A328721 Dirichlet g.f.: Product_{p prime, k&gt;=1} (1 + p^(-s*k)) / (1 - p^(-s*k)).
 * @author Georg Fischer
 */
public class A328721 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000688(), 1, new A050361(), 1);

  /** Construct the sequence. */
  public A328721() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
