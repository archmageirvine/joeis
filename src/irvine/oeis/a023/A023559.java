package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a008.A008578;

/**
 * A023559 Convolution of A023531 and (1, p(1), p(2), ...).
 * @author Sean A. Irvine
 */
public class A023559 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023559() {
    super(new SkipSequence(new A023531(), 1), new A008578());
  }
}
