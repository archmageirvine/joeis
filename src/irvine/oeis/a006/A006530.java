package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A006530 Gpf(n): greatest prime dividing n, for n &gt;= 2; a(1)=1.
 * @author Sean A. Irvine
 */
public class A006530 extends Sequence1 implements DirectSequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN)) {
      return Z.ONE;
    }
    final Z[] p = Jaguar.factor(mN).toZArray();
    return p[p.length - 1];
  }

  @Override
  public Z a(final Z n) {
    return Functions.GPF.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.GPF.z(n);
  }

}
