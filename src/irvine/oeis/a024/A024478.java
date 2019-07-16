package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a008.A008578;

/**
 * A024478.
 * @author Sean A. Irvine
 */
public class A024478 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024478() {
    super(new A000032(), new A008578());
  }
}
