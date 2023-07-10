package irvine.oeis.a360;
// manually convol/convprod at 2023-07-10 09:57

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000290;

/**
 * A360487 Convolution of A000009 and A000290.
 * @author Georg Fischer
 */
public class A360487 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A360487() {
    super(0, new A000009(), new A000290());
  }
}
