package irvine.oeis.a275;
// manually convprom/convprod at 2023-02-24 12:03

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A275388 Convolution of Fibonacci numbers (A000045) and partition numbers (A000041).
 * @author Georg Fischer
 */
public class A275388 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A275388() {
    super(0, "1,1", new SkipSequence(new A000045(), 1), new A000041());
  }

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.ZERO : super.next();
  }
}
