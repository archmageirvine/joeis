package irvine.oeis.a152;

import irvine.oeis.a000.A000027;
import irvine.oeis.a008.A008683;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A152902 Convolution sequence, A000027 / A008683.
 * @author Georg Fischer
 */
public class A152902 extends ConvolutionProduct {

  private final int mN = -1;

  /** Construct the sequence. */
  public A152902() {
    super(1, "1,-1", new A000027(), new A008683());
  }
}
