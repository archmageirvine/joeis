package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000032;

/**
 * A024310.
 * @author Sean A. Irvine
 */
public class A024310 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024310() {
    super(new A000027(), new A000032());
  }
}
