package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A061774 a(n) = (n-1)!, as n runs through the prime powers &gt;= 1.
 * @author Sean A. Irvine
 */
public class A061774 extends A000961 {

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next().intValueExact() - 1);
  }
}
