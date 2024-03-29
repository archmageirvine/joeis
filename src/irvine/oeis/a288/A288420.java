package irvine.oeis.a288;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a000.A000593;

/**
 * A288420 a(n) = Sum_{d|n} d^4*A000593(n/d).
 * @author Georg Fischer
 */
public class A288420 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000583(), 0, new A000593(), 1);

  /** Construct the sequence. */
  public A288420() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
