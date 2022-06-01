package irvine.oeis.a344;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A344321 a(n) = 2^(2*n - 5)*binomial(n-5/2, -1/2)*(36*n^4 - 78*n^3 + 54*n^2 - 48*n + 24)/((n + 1)*n*(n - 1)) for n &gt;= 2 and otherwise 1.
 * @author Georg Fischer
 */
public class A344321 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A344321() {
    super(0, "[[0],[40,-96, 122,-166, 112,-24],[40,-49,-5, 47,-31, 6]]", "[1, 1, 8]", 0);
  }
}
