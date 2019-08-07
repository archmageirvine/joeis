package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a023.A023533;

/**
 * A025096.
 * @author Sean A. Irvine
 */
public class A025096 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025096() {
    super(new A000032(), new A023533(), false);
    next();
  }
}
