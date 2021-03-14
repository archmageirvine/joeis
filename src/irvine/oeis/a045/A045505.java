package irvine.oeis.a045;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a040.A040075;

/**
 * A045505.
 * @author Sean A. Irvine
 */
public class A045505 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A045505() {
    super(new A000108(), new A040075());
  }
}
