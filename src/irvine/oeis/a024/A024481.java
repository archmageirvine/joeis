package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A024481.
 * @author Sean A. Irvine
 */
public class A024481 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024481() {
    super(new PrependSequence(new A008578(), 0), new SkipSequence(new A000045(), 1));
  }
}
