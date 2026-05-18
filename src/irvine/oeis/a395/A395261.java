package irvine.oeis.a395;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000293;

/**
 * A395261 allocated for Thomas DiFiore.
 * @author Sean A. Irvine
 */
public class A395261 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A395261() {
    super(0, new A000293());
  }
}
