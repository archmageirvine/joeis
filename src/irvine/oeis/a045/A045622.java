package irvine.oeis.a045;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;

/**
 * A045622 Convolution of A000108 (Catalan numbers) with A045543.
 * @author Sean A. Irvine
 */
public class A045622 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A045622() {
    super(1, new A000108(), new A045543());
  }
}
