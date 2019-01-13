package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000108;

/**
 * A014329.
 * @author Sean A. Irvine
 */
public class A014329 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014329() {
    super(new A000041(), new A000108());
  }
}

