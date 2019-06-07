package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085717 Consider the square lattice L and the sublattice K of index 5 spanned by <code>(2,-1), (1,2); a(n) =</code> number of points <code>(x,y)</code> in M with <code>x &gt;= 0, y &gt;= 0, x+y &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A085717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085717() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 1, 1, 2, 3, 5, 6});
  }
}
