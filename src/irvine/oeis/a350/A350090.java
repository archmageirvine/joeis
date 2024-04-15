package irvine.oeis.a350;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003215;

/**
 * A350090 a(n) is the number of indices i in the range 0 &lt;= i &lt;= n-1 such that A003215(n) - A003215(i) is an oblong number (A002378), where A003215 are the hex numbers.
 * @author Georg Fischer
 */
public class A350090 extends A003215 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next()).subtract(1);
  }
}
