package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a023.A023532;

/**
 * A024370.
 * @author Sean A. Irvine
 */
public class A024370 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024370() {
    super(new A023532(), new PrependSequence(new A002808(), 0));
  }
}
