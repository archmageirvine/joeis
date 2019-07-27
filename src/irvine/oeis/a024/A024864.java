package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a001.A001950;

/**
 * A024864.
 * @author Sean A. Irvine
 */
public class A024864 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024864() {
    super(new A001477(), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
