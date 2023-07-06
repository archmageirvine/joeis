package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a014.A014306;

/**
 * A023674 Convolution of A014306 (starting 0,0,1,1,0,1,1,1,1,...) and primes.
 * @author Sean A. Irvine
 */
public class A023674 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023674() {
    super(1, new A014306().skip(1), new A000040());
  }
}
