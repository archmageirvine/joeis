package irvine.oeis.a280;

import irvine.oeis.FiniteSequence;

/**
 * A280043 Solutions to the congruence <code>1^n+2^n+...+n^n == 43 (mod n)</code>.
 * @author Georg Fischer
 */
public class A280043 extends FiniteSequence {

  /** Construct the sequence. */
  public A280043() {
    super(1, 2, 6, 42, 43, 86, 258, 77658);
  }
}
