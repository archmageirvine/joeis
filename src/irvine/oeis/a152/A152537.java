package irvine.oeis.a152;

import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000079;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A152537 Convolution sequence: convolved with A000041 = powers of 2, (A000079).
 * @author Georg Fischer
 */
public class A152537 extends ConvolutionProduct {

  private final int mN = -1;

  /** Construct the sequence. */
  public A152537() {
    super(0, "1,-1", new A000079(), new A000041());
  }
}
