package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;

/**
 * A025089.
 * @author Sean A. Irvine
 */
public class A025089 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025089() {
    super(new A000032(), false);
    next();
  }
}
