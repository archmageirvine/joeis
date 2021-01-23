package irvine.oeis.a280;

import irvine.oeis.FiniteSequence;

/**
 * A280041 Solutions to the congruence 1^n+2^n+...+n^n == 19 (mod n).
 * @author Georg Fischer
 */
public class A280041 extends FiniteSequence {

  /** Construct the sequence. */
  public A280041() {
    super(1, 2, 6, 19, 38, 114, 798, 34314);
  }
}
