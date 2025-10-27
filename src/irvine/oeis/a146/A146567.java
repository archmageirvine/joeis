package irvine.oeis.a146;

import irvine.oeis.FiniteSequence;

/**
 * A146567 Numbers k such that k*sigma_0(k)/(k+sigma_0(k)) = c, c an integer.
 * @author Georg Fischer
 */
public class A146567 extends FiniteSequence {

  /** Construct the sequence. */
  public A146567() {
    super(1, FINITE, 2, 12, 24, 56, 60, 132, 1260);
  }
}
