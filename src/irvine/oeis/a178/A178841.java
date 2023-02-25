package irvine.oeis.a178;
// manually convprom/convprod at 2023-02-24 12:03

import irvine.oeis.a000.A000041;
import irvine.oeis.a011.A011782;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A178841 The number of pure inverting compositions of n.
 * The convolution of a(n) with A000041(n), the partitions of n, is A001782(n).
 * @author Georg Fischer
 */
public class A178841 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A178841() {
    super(0, "-1,1", new A000041(), new A011782());
  }
}
