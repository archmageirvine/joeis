package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a005.A005408;

/**
 * A025114.
 * @author Sean A. Irvine
 */
public class A025114 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025114() {
    super(new PrependSequence(new A005408(), 0), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
