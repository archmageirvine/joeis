package irvine.oeis.a360;
// manually convol/convprod at 2023-07-10 09:57

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000290;

/**
 * A360486 Convolution of A000041 and A000290.
 * @author Georg Fischer
 */
public class A360486 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A360486() {
    super(0, new A000041(), new A000290());
  }
}
