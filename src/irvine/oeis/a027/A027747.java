package irvine.oeis.a027;

import irvine.oeis.FiniteSequence;

/**
 * A027747 a(n) = n^n^n^..^n (6-n terms, n&lt;=5).
 * @author Georg Fischer
 */
public class A027747 extends FiniteSequence {

  /** Construct the sequence. */
  public A027747() {
    super(1, FINITE, 1, 65536, 7625597484987L, 256, 5);
  }
}
