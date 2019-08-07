package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a008.A008578;

/**
 * A025098.
 * @author Sean A. Irvine
 */
public class A025098 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025098() {
    super(new A000032(), new A008578(), false);
    next();
  }
}
