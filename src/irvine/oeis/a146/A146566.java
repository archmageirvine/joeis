package irvine.oeis.a146;

import irvine.oeis.FiniteSequence;

/**
 * A146566 Numbers k such that k*sigma_0(k) is divisible by (k - sigma_0(k)).
 * @author Sean A. Irvine
 */
public class A146566 extends FiniteSequence {

  /** Construct the sequence. */
  public A146566() {
    super(1, FINITE, 3, 4, 6, 8, 12, 18, 24, 36, 40, 60, 84, 156, 180, 600);
  }
}
