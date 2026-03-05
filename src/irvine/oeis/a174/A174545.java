package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A174545 Triangle read by rows: T(n,0) = T(n,n) = 1, T(n,k) = Stirling2(n,m) * 2^m where m = min(k,n-k).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A174545 extends LambdaTriangle {

  /** Construct the sequence. */
  public A174545() {
    super(0, 0, 0, (n, m) -> m == 0 || m.equals(n) ? Z.ONE : Functions.STIRLING2.z(n, Math.min(m, n - m)).shiftLeft(Math.min(m, n - m)));
  }
}
