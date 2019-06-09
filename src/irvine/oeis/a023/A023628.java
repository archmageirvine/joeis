package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A023628.
 * @author Sean A. Irvine
 */
public class A023628 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023628() {
    super(new A008578(), new SkipSequence(new A000045(), 2));
  }
}
