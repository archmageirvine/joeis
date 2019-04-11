package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154661 Numbers n such that <code>n! + 257</code> and abs(n! <code>- 257)</code> are both prime.
 * @author Georg Fischer
 */
public class A154661 extends FiniteSequence {

  /** Construct the sequence. */
  public A154661() {
    super(3, 4, 6, 7, 8, 18);
  }
}
