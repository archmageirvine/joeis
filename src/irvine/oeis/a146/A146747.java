package irvine.oeis.a146;

import irvine.oeis.FiniteSequence;

/**
 * A146747 Numbers k such that sigma_1(k)*sigma_0(k)/(sigma_1(k)-sigma_0(k)) is an integer.
 * @author Sean A. Irvine
 */
public class A146747 extends FiniteSequence {

  /** Construct the sequence. */
  public A146747() {
    super(1, FINITE, 2, 3, 5, 6, 20, 30);
  }
}
