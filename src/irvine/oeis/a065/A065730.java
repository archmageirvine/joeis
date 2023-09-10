package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065730 Largest square &lt;= n-th prime.
 * @author Sean A. Irvine
 */
public class A065730 extends A000040 {

  @Override
  public Z next() {
    return super.next().sqrt().square();
  }
}
