package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A023608.
 * @author Sean A. Irvine
 */
public class A023608 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023608() {
    super(new SkipSequence(new A000045(), 1), new A008578());
  }
}
