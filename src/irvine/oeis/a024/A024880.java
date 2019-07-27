package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a023.A023532;

/**
 * A024880.
 * @author Sean A. Irvine
 */
public class A024880 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024880() {
    super(new A023531(), new A023532(), false);
    next();
  }
}
