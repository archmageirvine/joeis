package irvine.oeis.a285;
// manually dirichcon/dirichcon2 at 2023-03-25 19:35

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000035;
import irvine.oeis.a000.A000583;

/**
 * A285989 a(0) = 0, a(n) = Sum_{0&lt;d|n, n/d odd} d^4 for n &gt; 0.
 * @author Georg Fischer
 */
public class A285989 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000035(), 0, new A000583(), 0);
  private int mN = 0;

  /** Construct the sequence. */
  public A285989() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : mSeq.next();
  }
}
