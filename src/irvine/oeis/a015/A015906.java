package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015906 First <code>k&gt;n</code> such that <code>k | n^k + n</code>.
 * @author Sean A. Irvine
 */
public class A015906 implements Sequence {

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
