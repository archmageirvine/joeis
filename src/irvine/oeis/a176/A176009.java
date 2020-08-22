package irvine.oeis.a176;

import irvine.oeis.FiniteSequence;

/**
 * A176009 Smallest prime p = p(k) containing all decimal digits from "1" up to "k" (k = 1,2, ..., 9, 0).
 * @author Georg Fischer
 */
public class A176009 extends FiniteSequence {

  /** Construct the sequence. */
  public A176009() {
    super(11, 211, 1123, 1423, 112543, 1124653, 1234657, 112345687L, 1123468597L, 10123457689L);
  }
}
