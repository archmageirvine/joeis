package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A078179 a(n) is the smallest prime of the form n^k + n - 1 with k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A078179 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    while (true) {
      n = n.multiply(mN);
      final Z t = n.add(mN - 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
