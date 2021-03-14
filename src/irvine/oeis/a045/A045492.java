package irvine.oeis.a045;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a020.A020920;

/**
 * A045492 Convolution of A000108 (Catalan numbers) with A020920.
 * @author Sean A. Irvine
 */
public class A045492 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A045492() {
    super(new A000108(), new A020920());
  }
}
