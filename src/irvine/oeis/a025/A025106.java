package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a005.A005408;

/**
 * A025106.
 * @author Sean A. Irvine
 */
public class A025106 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025106() {
    super(new SkipSequence(new A000045(), 1), new PrependSequence(new A005408(), 0), false);
    next();
  }
}
