package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a014.A014306;

/**
 * A024467.
 * @author Sean A. Irvine
 */
public class A024467 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024467() {
    super(new A000045(), new A014306());
  }
}
