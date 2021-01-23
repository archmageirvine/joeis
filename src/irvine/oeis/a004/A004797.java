package irvine.oeis.a004;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a002.A002024;

/**
 * A004797 Convolution of A002024 with itself.
 * @author Sean A. Irvine
 */
public class A004797 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A004797() {
    super(new A002024());
  }
}
