package irvine.oeis.a269;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000107;
import irvine.oeis.a027.A027852;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A269800 Convolution of A000107 and A027852.
 * @author Georg Fischer
 */
public class A269800 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A269800() {
    super(0, "1,1", new A000107().skip(1), new A027852().skip(1));
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
