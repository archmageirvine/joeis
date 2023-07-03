package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a014.A014306;

/**
 * A023661 Convolution of odd numbers and A014306.
 * @author Sean A. Irvine
 */
public class A023661 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023661() {
    super(1, new A005408(), new SkipSequence(new A014306(), 1));
  }
}
