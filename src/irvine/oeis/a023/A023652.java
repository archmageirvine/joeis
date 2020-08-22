package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a005.A005408;

/**
 * A023652 Convolution of (F(2), F(3), F(4), ...) and odd numbers.
 * @author Sean A. Irvine
 */
public class A023652 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023652() {
    super(new A005408(), new SkipSequence(new A000045(), 2));
  }
}
