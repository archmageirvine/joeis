package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.a008.A008655;
import irvine.oeis.a030.A030197;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A341557 Fourier coefficients of the modular form (1/t_{3A}) * F_{3A}^12.
 * @author Georg Fischer
 */
public class A341557 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A341557() {
    super(0, "-1,3", new A030197(), new A008655());
  }

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.ZERO : super.next();
  }
}
