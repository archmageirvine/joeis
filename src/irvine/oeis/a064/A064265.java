package irvine.oeis.a064;

import irvine.oeis.FiniteSequence;

/**
 * A064265 Paschal regular in Julian calendar for a year with Golden Number n.
 * @author Georg Fischer
 */
public class A064265 extends FiniteSequence {

  /** Construct the sequence. */
  public A064265() {
    super(5, 1, 6, 2, 5, 3, 6, 4, 0, 3, 1, 4, 0, 5, 1, 4, 2, 5, 3);
  }
}
