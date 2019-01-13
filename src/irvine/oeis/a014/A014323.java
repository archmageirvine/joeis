package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000110;

/**
 * A014323.
 * @author Sean A. Irvine
 */
public class A014323 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014323() {
    super(new A000110(), new A014322());
  }
}

