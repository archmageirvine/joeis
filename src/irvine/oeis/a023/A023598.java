package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a008.A008578;

/**
 * A023598 Convolution of <code>A023532</code> and <code>(1, p(1), p(2), ...)</code>.
 * @author Sean A. Irvine
 */
public class A023598 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023598() {
    super(new SkipSequence(new A023532(), 1), new A008578());
  }
}
