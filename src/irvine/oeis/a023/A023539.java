package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a002.A002808;

/**
 * A023539 Convolution of natural numbers with composite numbers.
 * @author Sean A. Irvine
 */
public class A023539 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023539() {
    super(1, new A000027(), new A002808());
  }
}
