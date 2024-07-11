package irvine.oeis.a054;
// manually 2024-07-11

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A054523 Triangle read by rows: T(n,k) = phi(n/k) if k divides n, T(n,k)=0 otherwise (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A054523 extends LambdaTriangle {

  /** Construct the sequence. */
  public A054523() {
    super(1, 1, 1, (n, k) -> (n % k == 0) ? Functions.PHI.z(n / k) : Z.ZERO);
  }

}
