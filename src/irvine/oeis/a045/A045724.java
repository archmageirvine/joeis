package irvine.oeis.a045;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a020.A020918;

/**
 * A045724 Convolution of Catalan numbers A000108 with A020918.
 * @author Sean A. Irvine
 */
public class A045724 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A045724() {
    super(new A000108(), new A020918());
  }
}
