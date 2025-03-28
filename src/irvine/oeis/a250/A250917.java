package irvine.oeis.a250;
// Generated by gen_seq4.pl rectoproc/holos5 at 2022-08-12 18:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A250917 Expansion of e.g.f. exp( x*C(x)^3 ) where C(x) = (1 - sqrt(1-4*x))/(2*x) is the g.f. of the Catalan numbers, A000108.
 * <code>sumrecursion( n!/k! * binomial(2*n+k-1,n-k) * 3*k/(n+2*k),k,a(n));</code>
 * @author Georg Fischer
 */
public class A250917 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A250917() {
    super(0, "[[0],[360,-864, 698,-174,-46, 30,-4],[-204, 304,-77,-32, 8, 1],[-72, 82, 13,-11],[-12,-2, 2]]", "1, 1, 7, 73, 1033", 0);
  }
}
