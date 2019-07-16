package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a023.A023532;

/**
 * A024374.
 * @author Sean A. Irvine
 */
public class A024374 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024374() {
    super(new A023532(), new PrependSequence(new A001950(), 0));
  }
}
