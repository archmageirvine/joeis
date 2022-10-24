package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A003649 Class number of real quadratic field Q(sqrt f), where f is the n-th squarefree number A005117(n).
 * @author Sean A. Irvine
 */
public class A003649 extends A005117 {

  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return Z.valueOf(QuadraticFieldUtils.classNumber(n.multiply(n.mod(4) > 1 ? 4 : 1)));
  }
}
