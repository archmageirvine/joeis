package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098068 If C is a doubly-even binary code of length N=24m+n, <code>1 &lt;= n &lt;= 24,</code> then the minimum distance of C^perp is bounded above by 4m+a(n).
 * @author Georg Fischer
 */
public class A098068 extends FiniteSequence {

  /** Construct the sequence. */
  public A098068() {
    super(1, 1, 1, 2, 1, 2, 3, 4, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 3, 4, 5, 6, 7, 8);
  }
}
