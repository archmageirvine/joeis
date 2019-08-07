package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A025092.
 * @author Sean A. Irvine
 */
public class A025092 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025092() {
    super(new A000032(), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
