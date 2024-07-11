package irvine.oeis.a054;
// manually 2024-07-11

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A054527 Triangle read by rows: T(n,k) = Moebius mu(k) (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A054527 extends LambdaTriangle {

  /** Construct the sequence. */
  public A054527() {
    super(1, 1, 1, (n, k) -> Functions.MOEBIUS.z(k));
  }

}
