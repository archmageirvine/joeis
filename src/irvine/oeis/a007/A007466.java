package irvine.oeis.a007;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.a000.A000027;

/**
 * A007466.
 * @author Sean A. Irvine
 */
public class A007466 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A007466() {
    super(new A000027());
  }
}
