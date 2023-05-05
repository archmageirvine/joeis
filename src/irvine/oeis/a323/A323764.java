package irvine.oeis.a323;

import irvine.math.z.Z;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000041;

/**
 * A323764 Dirichlet self-convolution of the integer partition numbers A000041.
 * @author Georg Fischer
 */
public class A323764 extends DirichletConvolutionSequence implements SequenceWithOffset {

  private int mN = -1;

  /** Construct the sequence. */
  public A323764() {
    super(new A000041(), 0);
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : super.next();
  }
}
