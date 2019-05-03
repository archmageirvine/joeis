package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098069 If C is a self-dual code over <code>Z_4</code> of length <code>N=24m+n, 1 &lt;= n &lt;= 24</code>, then the minimum Lee weight of C is bounded above by <code>8m+a(n)</code>.
 * @author Georg Fischer
 */
public class A098069 extends FiniteSequence {

  /** Construct the sequence. */
  public A098069() {
    super(2, 2, 2, 4, 2, 4, 6, 8, 2, 4, 4, 4, 4, 6, 6, 8, 8, 8, 6, 8, 8, 8, 10, 12);
  }
}
