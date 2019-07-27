package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023531;

/**
 * A024887.
 * @author Sean A. Irvine
 */
public class A024887 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024887() {
    super(new A023531(), new PrependSequence(new A000201(), 0), false);
    next();
  }
}
