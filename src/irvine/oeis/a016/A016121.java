package irvine.oeis.a016;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a008.A008934;

/**
 * A016121.
 * @author Sean A. Irvine
 */
public class A016121 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A016121() {
    super(new A008934(), 0);
  }
}
