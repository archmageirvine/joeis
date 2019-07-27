package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a023.A023531;

/**
 * A024886.
 * @author Sean A. Irvine
 */
public class A024886 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024886() {
    super(new A023531(), new PrependSequence(new A005408(), 0), false);
    next();
  }
}
