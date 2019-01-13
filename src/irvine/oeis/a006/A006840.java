package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a045.A045629;

/**
 * A006840.
 * @author Sean A. Irvine
 */
public class A006840 extends A045629 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN < 2) {
      return t;
    }
    return t.add(((mN & 1) == 0 ? Binomial.binomial(mN, mN / 2) : Binomial.binomial(mN - 1, (mN - 1) / 2)).divide2()).add(Z.ONE.shiftLeft(mN - 2)).divide2();
  }
}
