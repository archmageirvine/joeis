package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a002.A002808;

/**
 * A024461.
 * @author Sean A. Irvine
 */
public class A024461 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024461() {
    super(new A000045(), new PrependSequence(new A002808(), 0));
  }
}
