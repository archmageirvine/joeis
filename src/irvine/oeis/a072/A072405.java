package irvine.oeis.a072;
// manually 2021-10-19

import irvine.oeis.triangle.Triangle;

/**
 * A072405 Triangle T(n, k) = C(n,k) - C(n-2,k-1) for n &gt;= 3 and T(n, k) = 1 otherwise, read by rows.
 * @author Georg Fischer
 */
public class A072405 extends Triangle {

  /** Construct the sequence. */
  public A072405() {
    super("1, 1, 1, 1, 1, 1");
  }
}
