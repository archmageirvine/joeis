package irvine.oeis.a354;
// manually convol/convprod at 2023-07-10 09:57

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a002.A002476;
import irvine.oeis.a007.A007528;

/**
 * A354543 Convolution of A007528 and A002476.
 * @author Georg Fischer
 */
public class A354543 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A354543() {
    super(2, new A007528(), new A002476());
  }
}
