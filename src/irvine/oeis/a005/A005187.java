package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005187 <code>a(n) = a(floor(n/2)) +</code> n; also denominators in expansion of <code>1/sqrt(1-x)</code> are <code>2^a(n)</code>; also <code>2n -</code> number of <code>1</code>'s in binary expansion of <code>2n</code>.
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
