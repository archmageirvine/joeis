package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a008.A008472;

/**
 * A349712 a(n) = Sum_{d|n} sopf(d) * sopf(n/d).
 * @author Georg Fischer
 */
public class A349712 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A008472(), 1, new A008472(), 1);

  /** Construct the sequence. */
  public A349712() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
