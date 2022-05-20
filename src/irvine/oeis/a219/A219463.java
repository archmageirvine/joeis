package irvine.oeis.a219;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.a047.A047999;

/**
 * A219463 Triangle read by rows: T(n,k) = 1 - A047999(n,k), 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A219463 extends A047999 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
