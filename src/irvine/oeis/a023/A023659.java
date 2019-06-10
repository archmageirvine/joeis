package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a005.A005408;

/**
 * A023659 Convolution of odd numbers and <code>A001950</code>.
 * @author Sean A. Irvine
 */
public class A023659 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023659() {
    super(new A005408(), new A001950());
  }
}
