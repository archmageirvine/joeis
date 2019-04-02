package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000110;

/**
 * A014326 Convolution of partition numbers and Bell numbers.
 * @author Sean A. Irvine
 */
public class A014326 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014326() {
    super(new A000110(), new A000041());
  }
}

