package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A024458.
 * @author Sean A. Irvine
 */
public class A024458 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024458() {
    super(new A000045());
  }
}
