package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a014.A014306;

/**
 * A025110.
 * @author Sean A. Irvine
 */
public class A025110 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025110() {
    super(new SkipSequence(new A000045(), 1), new A014306(), false);
    next();
  }
}
