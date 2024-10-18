package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a057.A057120;
import irvine.oeis.a059.A059905;

/**
 * A072637 Inverse permutation to A072636.
 * @author Sean A. Irvine
 */
public class A072637 extends Sequence0 implements DirectSequence {

  private final DirectSequence mA059905 = new A059905();
  private Z mN = Z.NEG_ONE;

  private Z a059906(final Z n) {
    return mA059905.a(n.divide2());
  }

  private SExpression unpack(final Z n) {
    return n.isZero() ? new SExpression() : SExpression.createTree(unpack(a059906(n.subtract(1))), unpack(mA059905.a(n.subtract(1))));
  }

  @Override
  public Z a(final Z n) {
    return A057120.catalanGlobalRank(unpack(n).toZ());
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }
}
