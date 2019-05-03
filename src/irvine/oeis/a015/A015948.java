package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015948 <code>a(n) =</code> smallest k <code>&gt;= n</code> such that k <code>| (2^k + n)</code>.
 * @author Sean A. Irvine
 */
public class A015948 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = mN;
    while (true) {
      if (Z.TWO.modPow(k, k).equals(k.subtract(mN))) {
        return k;
      }
      k = k.add(1);
    }
  }
}
