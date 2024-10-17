package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a057.A057120;
import irvine.oeis.a059.A059905;

/**
 * A072635 Inverse permutation to A072634.
 * @author Sean A. Irvine
 */
public class A072635 extends Sequence0 {

  private final DirectSequence mA059905 = new A059905();
  private Z mN = Z.NEG_ONE;

  private Z a059906(final Z n) {
    return mA059905.a(n.divide2());
  }

  private SExpression unpack(final Z n) {
    return n.isZero() ? new SExpression() : SExpression.createTree(unpack(mA059905.a(n.subtract(1))), unpack(a059906(n.subtract(1))));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return A057120.catalanGlobalRank(unpack(mN).toZ());
  }
}
