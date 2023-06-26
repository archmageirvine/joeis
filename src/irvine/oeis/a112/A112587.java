package irvine.oeis.a112;

import irvine.oeis.FiniteSequence;

/**
 * A112587 Numbers m such that phi(m) &lt;= 2*tau(m), where phi=A000010 and tau=A000005.
 * @author Georg Fischer
 */
public class A112587 extends FiniteSequence {

  /** Construct the sequence. */
  public A112587() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 24, 28, 30, 36, 40, 42, 48, 60, 72, 84, 90, 120);
  }
}
