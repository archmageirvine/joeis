package irvine.oeis.a249;

import irvine.oeis.FiniteSequence;

/**
 * A249549 Conjectured largest number k not divisible by 10 such that k^k has exactly n distinct decimal digits.
 * @author Georg Fischer
 */
public class A249549 extends FiniteSequence {

  /** Construct the sequence. */
  public A249549() {
    super(2, 3, 6, 8, 7, 14, 15, 17, 34);
  }
}
