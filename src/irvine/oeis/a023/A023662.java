package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a005.A005408;

/**
 * A023662 Convolution of odd numbers and primes.
 * @author Sean A. Irvine
 */
public class A023662 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023662() {
    super(1, new A005408(), new A000040());
  }
}
