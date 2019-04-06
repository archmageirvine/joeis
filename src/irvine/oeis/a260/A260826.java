package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260826 Let f(k)=2*k^2+11. For n=0,1,...,11, a(n) = smallest m &gt;= 0 such that f(m-1) is composite if m&gt;0, f(m), f(m+1), ...,f(m+n-1) are prime, and f(m+n) is composite.
 * @author Georg Fischer
 */
public class A260826 extends FiniteSequence {

  /** Construct the sequence. */
  public A260826() {
    super(11, 13, 15, 18, 28, 578, 617, 2067795, 843755046L, 134239787815L, 1434279786435L, 0);
  }
}
