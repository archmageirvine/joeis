package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002808;

/**
 * A023560 Convolution of <code>A023531</code> and composite numbers <code>(A002808)</code>.
 * @author Sean A. Irvine
 */
public class A023560 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023560() {
    super(new SkipSequence(new A023531(), 1), new A002808());
  }
}
