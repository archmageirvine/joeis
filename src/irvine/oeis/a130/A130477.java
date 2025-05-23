package irvine.oeis.a130;
// Generated by gen_seq4.pl 2025-02-13.ack/trilamb0 at 2025-02-13 23:28

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A130477 T(n,k) is the number of permutations of [n] with maximum descent k, T(n,k) for n &gt;= 0 and 0 &lt;= k &lt;= n, triangle read by rows.
 * @author Georg Fischer
 */
public class A130477 extends LambdaTriangle {

  /** Construct the sequence. */
  public A130477() {
    super(0, 0, 0, (n, k) -> Z.valueOf(n - k + 1 + ((k == 0) ? 1 : 0)).multiply(Functions.FACTORIAL.z(n + 1)).divide(Functions.FACTORIAL.z(n - k + 2)));
  }
}
