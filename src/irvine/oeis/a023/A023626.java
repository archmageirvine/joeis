package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a008.A008578;

/**
 * A023626 Self-convolution of (1, p(1), p(2), ...).
 * @author Sean A. Irvine
 */
public class A023626 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023626() {
    super(1, new A008578());
  }
}
