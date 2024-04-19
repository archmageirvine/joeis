package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.a004.A004016;
import irvine.oeis.a030.A030197;
import irvine.oeis.transform.ConvolutionProduct;
import irvine.oeis.transform.RootSequence;

/**
 * A341305 Fourier coefficients of the modular form (1/28)*(E_6(t)+27*E_6(3*t)).
 * @author Georg Fischer
 */
public class A341305 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A341305() {
    this(6);
  }

  /**
   * Generic constructor with parameter
   * @param exponent exponents for F_{3A}
   */
  public A341305(final int exponent) {
    super(0, "1/2," + exponent,
      new RootSequence(0, new A030197().skip(1), -1, 1) { // this is (1 - 108/t_{3A})
        private int mN = -1;

        @Override
        public Z next() {
          ++mN;
          return (mN == 0) ? Z.ONE : super.next().negate().multiply(108);
        }
      },
      new A004016()); // this is F_{3A}
  }
}
