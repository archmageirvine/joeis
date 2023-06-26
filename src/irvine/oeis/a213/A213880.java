package irvine.oeis.a213;

import irvine.oeis.FiniteSequence;

/**
 * A213880 a(n) = sum of n-digit numbers with distinct nonzero digits.
 * @author Georg Fischer
 */
public class A213880 extends FiniteSequence {

  /** Construct the sequence. */
  public A213880() {
    super(1, FINITE, 45, 3960, 279720, 16798320, 839991600L, 33599966400L, 1007999899200L, 20159999798400L, 201599999798400L);
  }
}
