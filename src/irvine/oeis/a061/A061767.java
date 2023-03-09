package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061767 a(n) = smallest composite number of the form k*n + 1.
 * @author Sean A. Irvine
 */
public class A061767 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.ZERO;
    while (true) {
      t = t.add(mN);
      final Z u = t.add(1);
      if (!u.isProbablePrime()) {
        return u;
      }
    }
  }
}
