package irvine.oeis.a141;

import irvine.oeis.FiniteSequence;

/**
 * A141109 Even numbers <code>2n</code> such that for every prime p in <code>[n,2n-2],</code> 2n-p is also prime.
 * @author Georg Fischer
 */
public class A141109 extends FiniteSequence {

  /** Construct the sequence. */
  public A141109() {
    super(4, 6, 8, 10, 12, 14, 16, 18, 24, 30, 36, 42, 48, 60, 90, 210);
  }
}
