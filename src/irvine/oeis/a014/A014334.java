package irvine.oeis.a014;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A014334.
 * @author Sean A. Irvine
 */
public class A014334 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A014334() {
    super(new A000045());
  }
}

