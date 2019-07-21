package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023533;

/**
 * A024692.
 * @author Sean A. Irvine
 */
public class A024692 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024692() {
    super(new A023533());
  }
}
