package irvine.oeis.a174;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a173.A173018;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A174036 Triangle read by rows: T(n,k) = 1 if k=0 or k=n, otherwise T(n,k) = binomial(Eulerian(n+1, k), min(n-k,k)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A174036 extends LambdaTriangle {

  private static final DirectArray A173018 = new A173018();

  /** Construct the sequence. */
  public A174036() {
    super(0, 0, 0, (n, m) -> m == 0 || m.equals(n) ? Z.ONE : Binomial.binomial(A173018.a(n + 1, m), Math.min(n - m, m)));
  }
}
