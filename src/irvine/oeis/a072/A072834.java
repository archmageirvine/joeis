package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a023.A023919;

/**
 * A072834 Exponents occurring in expansion of F_8(q^2).
 * @author Sean A. Irvine
 */
public class A072834 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072834() {
    super(0, new A023919(), NONZERO);
  }
}
