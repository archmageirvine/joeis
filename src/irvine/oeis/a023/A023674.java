package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a014.A014306;

/**
 * A023674 Convolution of <code>A014306</code> (starting <code>0,0,1,1,0,1,1,1,1,...)</code> and primes.
 * @author Sean A. Irvine
 */
public class A023674 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023674() {
    super(new SkipSequence(new A014306(), 1), new A000040());
  }
}
