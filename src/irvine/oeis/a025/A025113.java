package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a005.A005408;

/**
 * A025113.
 * @author Sean A. Irvine
 */
public class A025113 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025113() {
    super(new PrependSequence(new A005408(), 0), new PrependSequence(new A000201(), 0), false);
    next();
  }
}
