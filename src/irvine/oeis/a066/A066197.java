package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066197 Squarefree kernel of (n*prime(n))*(n+prime(n)).
 * @author Sean A. Irvine
 */
public class A066197 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    return Jaguar.factor(p.multiply(++mN).multiply(p.add(mN))).squareFreeKernel();
  }
}
