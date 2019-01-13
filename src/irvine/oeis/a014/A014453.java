package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000122;
import irvine.oeis.a004.A004016;

/**
 * A014453.
 * @author Sean A. Irvine
 */
public class A014453 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014453() {
    super(new A004016(), new A000122());
  }
}

