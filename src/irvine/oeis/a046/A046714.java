package irvine.oeis.a046;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a000.A000351;

/**
 * A046714 Convolution of A000108 (Catalan) with A000351 (powers of 5).
 * @author Sean A. Irvine
 */
public class A046714 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A046714() {
    super(new A000108(), new A000351());
  }
}
