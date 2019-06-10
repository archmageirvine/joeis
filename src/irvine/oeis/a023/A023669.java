package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a014.A014306;

/**
 * A023669 Convolution of <code>A001950</code> and <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023669 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023669() {
    super(new A001950(), new SkipSequence(new A014306(), 1));
  }
}
