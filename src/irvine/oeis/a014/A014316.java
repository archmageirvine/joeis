package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a000.A000290;

/**
 * A014316 Convolution of Catalan numbers and squares.
 * @author Sean A. Irvine
 */
public class A014316 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014316() {
    super(new A000108(), new A000290());
  }
}

