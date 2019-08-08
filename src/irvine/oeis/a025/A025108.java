package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001950;

/**
 * A025108.
 * @author Sean A. Irvine
 */
public class A025108 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025108() {
    super(new SkipSequence(new A000045(), 1), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
