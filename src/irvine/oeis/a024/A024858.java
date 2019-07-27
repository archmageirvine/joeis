package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001477;

/**
 * A024858.
 * @author Sean A. Irvine
 */
public class A024858 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024858() {
    super(new A001477(), new A000032(), false);
    next();
  }
}
