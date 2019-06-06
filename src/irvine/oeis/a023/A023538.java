package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a008.A008578;

/**
 * A023538 Convolution of natural numbers with <code>(1, p(1), p(2)</code>, ... <code>)</code>, where <code>p(k)</code> is the k-th prime.
 * @author Sean A. Irvine
 */
public class A023538 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023538() {
    super(new A000027(), new A008578());
  }
}
