package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051248 n^a(n) is the smallest power of n (with a(n) &gt; 1) which starts with n.
 * @author Sean A. Irvine
 */
public class A051248 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final String s = mN.toString();
    long k = 1;
    Z t = mN;
    while (true) {
      ++k;
      t = t.multiply(mN);
      if (t.toString().startsWith(s)) {
        return Z.valueOf(k);
      }
    }
  }
}
