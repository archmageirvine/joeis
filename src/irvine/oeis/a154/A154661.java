package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154661 Numbers k such that k! + 257 and abs(k! - 257) are both prime.
 * @author Georg Fischer
 */
public class A154661 extends FiniteSequence {

  /** Construct the sequence. */
  public A154661() {
    super(1, FINITE, 3, 4, 6, 7, 8, 18);
  }
}
