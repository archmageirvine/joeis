package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;

/**
 * A024695.
 * @author Sean A. Irvine
 */
public class A024695 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024695() {
    super(new A014306());
  }
}
