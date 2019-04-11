package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006530 Gpf(n): greatest prime dividing <code>n,</code> for <code>n &gt;= 2</code>; <code>a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A006530 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN)) {
      return Z.ONE;
    }
    final Z[] p = Cheetah.factor(mN).toZArray();
    return p[p.length - 1];
  }
}
