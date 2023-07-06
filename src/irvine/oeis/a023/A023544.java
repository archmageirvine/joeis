package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a014.A014306;

/**
 * A023544 Convolution of natural numbers with A014306.
 * @author Sean A. Irvine
 */
public class A023544 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023544() {
    super(1, new A000027(), new A014306().skip(1));
  }
}
