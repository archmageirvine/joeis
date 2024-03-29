package irvine.oeis.a092;
// Generated by gen_seq4.pl holos at 2021-06-16 17:26
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A092472 a(n)=sum(i+j+k=n,(2n)!/(i+j)!/(j+k)!/(k+i)!) 0&lt;=i&lt;=n, 0&lt;=j&lt;=n, 0&lt;=k&lt;=n.
 * Recurrence (for n&gt;3): (n-3)*n*a(n) = (17*n^2-55*n+24)*a(n-1) - 36*(n-2)*(2*n-3)*a(n-2).
 * @author Georg Fischer
 */
public class A092472 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A092472() {
    super(0, "[[0],[-216, 252,-72],[24,-55, 17],[0, 3,-1]]", "[1, 6, 54, 510]", 0);
  }
}
