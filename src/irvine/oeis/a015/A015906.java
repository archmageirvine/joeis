package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015906 First k&gt;n such that k | n^k + n.
 * @author Sean A. Irvine
 */
public class A015906 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    int k = ++mN;
    Z t = Z.valueOf(mN).pow(mN);
    while (true) {
      t = t.multiply(mN);
      if ((t.mod(++k) + mN) % k == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
