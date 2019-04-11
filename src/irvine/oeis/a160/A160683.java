package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160683 Numbers <code>n &gt;= 1</code> such that A000045(n)/A000005(A000045(n)) is an integer.
 * @author Georg Fischer
 */
public class A160683 extends FiniteSequence {

  /** Construct the sequence. */
  public A160683() {
    super(1, 2, 3, 6, 24, 48);
  }
}
