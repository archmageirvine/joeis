package irvine.oeis.a053;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000312;

/**
 * A053729 Self-convolution of 1,4,27,256,3125,46656,... (cf. A000312).
 * @author Sean A. Irvine
 */
public class A053729 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A053729() {
    super(1, new A000312().skip(1));
  }
}
