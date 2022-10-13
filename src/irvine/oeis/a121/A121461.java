package irvine.oeis.a121;
// manually rio/trigf at 2022-10-11 21:49

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A121461 Triangle read by rows: T(n,k) is the number of nondecreasing Dyck paths of semilength n, having last ascent of length k (1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A121461 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A121461() {
    super(0, new long[] {1, -2, 0, 1, 0, 0}, new long[] {1, -3, -1, 1, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
