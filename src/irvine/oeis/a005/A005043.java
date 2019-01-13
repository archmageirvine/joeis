package irvine.oeis.a005;

import irvine.oeis.InverseBinomialTransformSequence;
import irvine.oeis.a000.A000108;

/**
 * A005043.
 * @author Sean A. Irvine
 */
public class A005043 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A005043() {
    super(new A000108(), 0);
  }
}
