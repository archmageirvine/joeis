package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A062824 a(n) = Ch(A005117(n)) where Ch(n) is Chowla's function and A005117(n) are the squarefree numbers.
 * @author Sean A. Irvine
 */
public class A062824 extends A005117 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma().subtract(mN + 1);
  }
}
