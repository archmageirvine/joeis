package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a008.A008578;

/**
 * A023617 Convolution of Lucas numbers and (1, p(1), p(2), ...).
 * @author Sean A. Irvine
 */
public class A023617 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023617() {
    super(new A000204(), new A008578());
  }
}
