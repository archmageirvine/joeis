package irvine.oeis.a116;
// Generated by gen_seq4.pl rectoproc/holos5 at 2022-08-12 18:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A116363 a(n) = dot product of row n in Catalan triangle A033184 with row n in Pascal's triangle.
 * sumrecursion(C(n,k)*C(2*n-k+1,n-k)*(k+1)/(2*n-k+1),k,a(n));
 * @author Georg Fischer
 */
public class A116363 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116363() {
    super(0, "[[0],[-7, 5, 2],[20,-36,-12],[5, 7, 2]]", "1, 2, 7, 30", 0);
  }
}
