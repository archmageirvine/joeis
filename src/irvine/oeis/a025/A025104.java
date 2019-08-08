package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a018.A018252;

/**
 * A025104.
 * @author Sean A. Irvine
 */
public class A025104 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025104() {
    super(new A018252(), new PrependSequence(new A005408(), 0), false);
    next();
  }
}
