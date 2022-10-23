package irvine.oeis.a354;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A354184 a(1) = a(2) = 1, a(n) = (A007947(31*a(n-1)) + A007947(31*a(n-2)))/31 for n &gt;= 3, i.e., 31*a(n) is the largest squarefree divisor of 31*a(n-1) plus the largest squarefree divisor of 31*a(n-2).
 * @author Sean A. Irvine
 */
public class A354184 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = Jaguar.factor(mA.multiply(31)).squareFreeKernel().add(Jaguar.factor(mB.multiply(31)).squareFreeKernel()).divide(31);
    mA = mB;
    mB = t;
    return t;
  }
}
