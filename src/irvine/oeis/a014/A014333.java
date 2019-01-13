package irvine.oeis.a014;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.a000.A000108;

/**
 * A014333.
 * @author Sean A. Irvine
 */
public class A014333 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A014333() {
    super(new A000108(), new A014330());
  }
}

