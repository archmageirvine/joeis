package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a060.A060640;
import irvine.oeis.a348.A348971;

/**
 * A349143 a(n) = Sum_{d|n} A038040(d) * A348507(n/d), where A038040(n) = n*tau(n), A348507(n) = A003959(n) - n, and A003959 is fully multiplicative with a(p) = (p+1).
 * @author Georg Fischer
 */
public class A349143 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A060640(), 1, new A348971(), 1);

  /** Construct the sequence. */
  public A349143() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
