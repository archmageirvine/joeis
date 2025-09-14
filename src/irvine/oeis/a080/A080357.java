package irvine.oeis.a080;

import irvine.oeis.InverseSequence;

/**
 * A080357 Smallest x such that between x and 2x exactly n twin prime numbers can be found.
 * @author Sean A. Irvine
 */
public class A080357 extends InverseSequence {

  /** Construct the sequence. */
  public A080357() {
    super(1, new A080356());
  }
}
