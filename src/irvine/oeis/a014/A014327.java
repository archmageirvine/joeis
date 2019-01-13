package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a000.A000110;

/**
 * A014327.
 * @author Sean A. Irvine
 */
public class A014327 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014327() {
    super(new A000110(), new A000108());
  }
}

