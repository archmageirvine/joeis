package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023532;

/**
 * A025069 Duplicate of A024377.
 * @author Sean A. Irvine
 */
public class A025069 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025069() {
    super(new A023532(), new PrependSequence(new A008578(), 0), false);
    next();
  }
}
