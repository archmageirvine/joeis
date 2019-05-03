package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019449 Irreducible quadruple Euler sums of weight <code>2n+10 (verified</code> for <code>n &lt;= 14)</code>.
 * @author Sean A. Irvine
 */
public class A019449 extends CoordinationSequence {

  // Conjectural

  /** Construct the sequence. */
  public A019449() {
    super(
      new long[] {1, 0, 2, 1, 1, 2, 0, 1, -1},
      new int[] {1, 3, 4, 6});
  }
}
