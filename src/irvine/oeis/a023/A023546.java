package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;

/**
 * A023546 Convolution of natural numbers &gt;= 2 and A023531.
 * @author Sean A. Irvine
 */
public class A023546 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023546() {
    super(1, new A000027().skip(1), new A023531().skip(1));
  }
}
