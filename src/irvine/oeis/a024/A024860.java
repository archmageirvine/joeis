package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a002.A002808;

/**
 * A024860.
 * @author Sean A. Irvine
 */
public class A024860 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024860() {
    super(new A001477(), new PrependSequence(new A002808(), 0), false);
    next();
  }
}
