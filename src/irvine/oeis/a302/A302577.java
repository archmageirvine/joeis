package irvine.oeis.a302;
// manually convprom/convprod at 2023-07-10 13:48

import irvine.math.z.Z;
import irvine.oeis.a186.A186284;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A302577 Convolution square root of A186284 multiplied by 2^n.
 * @author Georg Fischer
 */
public class A302577 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A302577() {
    super(0, "1/2", new A186284() {
      private int mN = -1;

      @Override
      public Z next() {
        return super.next().multiply(Z.ONE.shiftLeft(++mN));
      }
    });
  }
}
