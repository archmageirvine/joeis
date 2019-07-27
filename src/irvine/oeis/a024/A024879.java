package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;

/**
 * A024879.
 * @author Sean A. Irvine
 */
public class A024879 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024879() {
    super(new A023531(), false);
    next();
  }
}
