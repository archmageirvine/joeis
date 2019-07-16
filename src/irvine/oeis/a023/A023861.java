package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001477;

/**
 * A023861.
 * @author Sean A. Irvine
 */
public class A023861 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023861() {
    super(new A001477(), new A000032());
  }
}
