package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023532;

/**
 * A024371.
 * @author Sean A. Irvine
 */
public class A024371 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024371() {
    super(new PrependSequence(new A023532(), 0), new A000045());
    next();
  }
}
