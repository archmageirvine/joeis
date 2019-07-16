package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a008.A008578;

/**
 * A024470.
 * @author Sean A. Irvine
 */
public class A024470 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024470() {
    super(new A000032(), new PrependSequence(new A008578(), 0));
  }
}
