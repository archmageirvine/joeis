package irvine.oeis.a138;
// Generated by gen_seq4.pl 2024-07-11/tablamb at 2024-07-11 18:00

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A138099 Irregular triangle read by rows: T(n,k) = k + floor(n/2), 1 &lt;= k &lt;= ceiling(n/2).
 * @author Georg Fischer
 */
public class A138099 extends LambdaTable {

  /** Construct the sequence. */
  public A138099() {
    super(1, 1, n -> new Integer[]{1, ((n & 1) == 1) ? (n + 1) / 2 : n / 2}, (n, k) -> Z.valueOf(k + n / 2));
  }
}
