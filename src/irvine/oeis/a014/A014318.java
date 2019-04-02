package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000108;

/**
 * A014318 Convolution of Catalan numbers and powers of 2.
 * @author Sean A. Irvine
 */
public class A014318 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014318() {
    super(new A000108(), new A000079());
  }
}

