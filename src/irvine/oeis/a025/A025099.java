package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;

/**
 * A025099.
 * @author Sean A. Irvine
 */
public class A025099 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025099() {
    super(new PrependSequence(new A008578(), 0), false);
    next();
  }
}
