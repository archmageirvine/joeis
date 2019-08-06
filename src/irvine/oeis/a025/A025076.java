package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;
import irvine.oeis.a023.A023532;

/**
 * A025076.
 * @author Sean A. Irvine
 */
public class A025076 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025076() {
    super(new A023532(), new A014306(), false);
    next();
  }
}
