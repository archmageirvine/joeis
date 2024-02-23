package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A005187 a(n) = a(floor(n/2)) + n; also denominators in expansion of 1/sqrt(1-x) are 2^a(n); also 2n - number of 1's in binary expansion of 2n.
 * @author Sean A. Irvine
 */
public class A005187 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    Z s = Z.ZERO;
    Z t = Z.ONE;
    while (t.compareTo(n) <= 0) {
      s = s.add(n.divide(t));
      t = t.multiply2();
    }
    return s;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
