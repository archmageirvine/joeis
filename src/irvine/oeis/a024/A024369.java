package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023532;

/**
 * A024369.
 * @author Sean A. Irvine
 */
public class A024369 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024369() {
    super(new A023532(), new PrependSequence(new A008578(), 0));
  }
}
