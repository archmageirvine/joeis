package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A024468.
 * @author Sean A. Irvine
 */
public class A024468 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024468() {
    super(new A000045(), new A008578());
  }
}
