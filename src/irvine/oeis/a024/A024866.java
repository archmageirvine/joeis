package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a014.A014306;

/**
 * A024866.
 * @author Sean A. Irvine
 */
public class A024866 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024866() {
    super(new A001477(), new A014306(), false);
    next();
  }
}
