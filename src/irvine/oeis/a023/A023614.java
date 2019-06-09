package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a014.A014306;

/**
 * A023614 Convolution of Fibonacci numbers and <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023614 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023614() {
    super(new SkipSequence(new A000045(), 1), new SkipSequence(new A014306(), 1));
  }
}
