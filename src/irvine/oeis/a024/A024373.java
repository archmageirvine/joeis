package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023532;

/**
 * A024373.
 * @author Sean A. Irvine
 */
public class A024373 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024373() {
    super(new A023532(), new PrependSequence(new A000201(), 0));
  }
}
