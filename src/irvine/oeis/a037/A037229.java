package irvine.oeis.a037;

import irvine.oeis.FiniteSequence;

/**
 * A037229 Numbers k such that pi(k) &gt;= phi(k).
 * @author Georg Fischer
 */
public class A037229 extends FiniteSequence {

  /** Construct the sequence. */
  public A037229() {
    super(2, 3, 4, 6, 8, 10, 12, 14, 18, 20, 24, 30, 42, 60, 90);
  }
}
