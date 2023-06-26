package irvine.oeis.a302;

import irvine.oeis.FiniteSequence;

/**
 * A302344 Solutions to the congruence 1^n + 2^n + ... + n^n == 193 (mod n).
 * @author Georg Fischer
 */
public class A302344 extends FiniteSequence {

  /** Construct the sequence. */
  public A302344() {
    super(1, FINITE, 1, 2, 6, 193, 386, 1158, 8106, 348558);
  }
}
