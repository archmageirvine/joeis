package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A007672 a(n) = A002034(n)!/n.
 * @author Sean A. Irvine
 */
public class A007672 extends A002034 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next()).divide(++mN);
  }
}
