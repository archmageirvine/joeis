package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a001.A001950;

/**
 * A023542 Convolution of natural numbers with Beatty sequence for <code>tau^2 A001950</code>.
 * @author Sean A. Irvine
 */
public class A023542 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023542() {
    super(new A000027(), new A001950());
  }
}
