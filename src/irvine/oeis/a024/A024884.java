package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a023.A023531;

/**
 * A024884.
 * @author Sean A. Irvine
 */
public class A024884 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024884() {
    super(new A023531(), new PrependSequence(new A002808(), 0), false);
    next();
  }
}
