package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005187 a(n) = a(floor(n/2)) + n; also denominators in expansion of 1/sqrt(1-x) are 2^a(n); also 2n - number of 1's in binary expansion of 2n.
 * @author Sean A. Irvine
 */
public class A005187 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s = Z.ZERO;
    Z t = Z.ONE;
    while (t.compareTo(mN) <= 0) {
      s = s.add(mN.divide(t));
      t = t.multiply2();
    }
    return s;
  }
}
