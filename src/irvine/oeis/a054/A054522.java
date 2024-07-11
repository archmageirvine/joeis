package irvine.oeis.a054;
// manually 2024-07-11

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A054522 Triangle T(n,k): T(n,k) = phi(k) if k divides n, T(n,k)=0 otherwise (n &gt;= 1, 1&lt;=k&lt;=n). T(n,k) = number of elements of order k in cyclic group of order n.
 * @author Georg Fischer
 */
public class A054522 extends LambdaTriangle {

  /** Construct the sequence. */
  public A054522() {
    super(1, 1, 1, (n, k) -> (n % k == 0) ? Functions.PHI.z(k) : Z.ZERO);
  }

}
