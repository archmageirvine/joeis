package irvine.oeis.a048;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000041;

/**
 * A048574 Self-convolution of 1 2 3 5 7 11 15 22 30 42 56 77 ... (A000041).
 * @author Sean A. Irvine
 */
public class A048574 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A048574() {
    super(2, new A000041().skip(1));
  }
}
