package irvine.oeis.a006;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a000.A000081;

/**
 * A006930.
 * @author Sean A. Irvine
 */
public class A006930 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A006930() {
    super(new A000081(), 1);
  }
}
