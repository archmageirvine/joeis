package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015908 First odd k&gt;n such that k | n^k <code>+ n</code> (or 0 if n=2^m).
 * @author Sean A. Irvine
 */
public class A015908 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    int k = ++mN | 1;
    if (mN != 0 && (mN & (mN - 1)) == 0) {
      return Z.ZERO;
    }
    if (k > mN) {
      k -= 2;
    }
    final Z s = Z.valueOf(mN).square();
    Z t = Z.valueOf(mN).pow(k);
    while (true) {
      k += 2;
      t = t.multiply(s);
      if ((t.mod(k) + mN) % k == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
