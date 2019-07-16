package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a023.A023533;

/**
 * A024326.
 * @author Sean A. Irvine
 */
public class A024326 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024326() {
    super(new A023531(), new A023533());
  }
}
