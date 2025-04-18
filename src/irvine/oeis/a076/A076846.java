package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076846 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z v = Z.ONE;
    while (true) {
      v = v.multiply(mN);
      final Z t = v.add(mN - 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
