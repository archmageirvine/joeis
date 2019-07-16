package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a008.A008578;

/**
 * A024480.
 * @author Sean A. Irvine
 */
public class A024480 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024480() {
    super(new PrependSequence(new A008578(), 0), new PrependSequence(new A002808(), 0));
  }
}
