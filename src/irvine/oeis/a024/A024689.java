package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;

/**
 * A024689.
 * @author Sean A. Irvine
 */
public class A024689 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024689() {
    super(new PrependSequence(new A001950(), 0));
  }
}
