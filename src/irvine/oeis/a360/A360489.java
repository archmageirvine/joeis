package irvine.oeis.a360;
// manually convol/convprod at 2023-07-10 09:57

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000219;
import irvine.oeis.a001.A001477;

/**
 * A360489 Convolution of A000219 and A001477.
 * @author Georg Fischer
 */
public class A360489 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A360489() {
    super(0, new A000219(), new A001477());
  }
}
