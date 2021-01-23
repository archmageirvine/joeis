package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a014.A014306;

/**
 * A023666 Convolution of A000201 and A014306.
 * @author Sean A. Irvine
 */
public class A023666 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023666() {
    super(new A000201(), new SkipSequence(new A014306(), 1));
  }
}
