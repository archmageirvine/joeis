package irvine.oeis.a067;

import irvine.oeis.FiniteSequence;

/**
 * A067635 a(1) = 1; set of digits of a(n)^2 is a proper subset of the set of digits of a(n+1)^2.
 * @author Georg Fischer
 */
public class A067635 extends FiniteSequence {

  /** Construct the sequence. */
  public A067635() {
    super(1, FINITE, 1, 4, 13, 36, 113, 487, 1036, 3267, 10136, 32043);
  }
}
