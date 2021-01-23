package irvine.oeis.a302;

import irvine.oeis.FiniteSequence;

/**
 * A302343 Solutions to the congruence 1^n + 2^n + ... + n^n == 79 (mod n).
 * @author Georg Fischer
 */
public class A302343 extends FiniteSequence {

  /** Construct the sequence. */
  public A302343() {
    super(1, 2, 6, 79, 158, 474, 3318, 142674);
  }
}
