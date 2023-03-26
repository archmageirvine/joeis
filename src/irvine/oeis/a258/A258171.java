package irvine.oeis.a258;
// manually dirichcon/dirichcon2 at 2023-03-25 19:35

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000110;

/**
 * A258171 a(n) = Sum_{d|n} phi(d)*Bell(n/d) for n&gt;0, a(0) = 0.
 * @author Georg Fischer
 */
public class A258171 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000010(), 1, new A000110(), 0);
  private int mN = 0;

  /** Construct the sequence. */
  public A258171() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : mSeq.next();
  }
}
