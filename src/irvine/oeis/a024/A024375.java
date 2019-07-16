package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023532;
import irvine.oeis.a023.A023533;

/**
 * A024375.
 * @author Sean A. Irvine
 */
public class A024375 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024375() {
    super(new A023532(), new A023533());
  }
}
