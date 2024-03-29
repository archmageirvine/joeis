package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a002.A002808;

/**
 * A023560 Convolution of A023531 and composite numbers (A002808).
 * @author Sean A. Irvine
 */
public class A023560 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023560() {
    super(1, new A023531().skip(1), new A002808());
  }
}
