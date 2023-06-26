package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098069 If C is a self-dual code over Z_4 of length N=24m+n, 1 &lt;= n &lt;= 24, then the minimum Lee weight of C is bounded above by 8m+a(n).
 * @author Georg Fischer
 */
public class A098069 extends FiniteSequence {

  /** Construct the sequence. */
  public A098069() {
    super(1, FINITE, 2, 2, 2, 4, 2, 4, 6, 8, 2, 4, 4, 4, 4, 6, 6, 8, 8, 8, 6, 8, 8, 8, 10, 12);
  }
}
