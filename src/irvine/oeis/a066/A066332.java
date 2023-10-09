package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066332 a(1)=1; for n &gt; 0, a(n+1) = rad(a(n))*n where rad=A007947.
 * @author Sean A. Irvine
 */
public class A066332 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = Jaguar.factor(mA).squareFreeKernel().multiply(mN);
    }
    return mA;
  }
}
