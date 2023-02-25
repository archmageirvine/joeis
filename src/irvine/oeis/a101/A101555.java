package irvine.oeis.a101;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000244;
import irvine.oeis.a010.A010060;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A101555 Convolution of A010060 and A000244.
 * @author Georg Fischer
 */
public class A101555 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A101555() {
    super(0, "1,1", new SkipSequence(new A010060(), 1), new A000244());
  }

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.ZERO : super.next();
  }
}
