package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023531;

/**
 * A024320.
 * @author Sean A. Irvine
 */
public class A024320 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024320() {
    super(new A023531(), new PrependSequence(new A008578(), 0));
  }
}
