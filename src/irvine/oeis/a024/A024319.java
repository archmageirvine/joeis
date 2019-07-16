package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a023.A023531;

/**
 * A024319.
 * @author Sean A. Irvine
 */
public class A024319 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024319() {
    super(new A023531(), new A000032());
  }
}
