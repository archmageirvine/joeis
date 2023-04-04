package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004016;
import irvine.oeis.a030.A030197;
import irvine.oeis.transform.ConvolutionProduct;
import irvine.oeis.transform.RootSequence;

/**
 * A341555 Fourier coefficients of the modular form (1/t_{3A}) * sqrt(1 - 108/t_{3A}) * F_{3A}^10.
 * @author Georg Fischer
 */
public class A341555 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A341555() {
    this(10);
  }

  /**
   * Generic constructor with parameter
   * @param exponent exponents for F_{3A}
   */
  public A341555(final int exponent) {
    super(0, "-1,1/2," + String.valueOf(exponent),
      new A030197(), // this is 1/t_{3A}
      new RootSequence(0, new SkipSequence(new A030197(), 1), -1, 1) { // this is (1 - 108/t_{3A})
        private int mN = -1;

        @Override
        public Z next() {
          ++mN;
          return (mN == 0) ? Z.ONE : super.next().negate().multiply(108);
        }
      },
      new A004016()); // this is F_{3A}
  }

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.ZERO : super.next();
  }
}
