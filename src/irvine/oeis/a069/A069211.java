package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069211.
 * @author Sean A. Irvine
 */
public class A069211 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z a = Z.ONE;
    Z b = mN;
    long k = 1;
    while (!Z.ONE.equals(b) || !Z.ONE.equals(a)) {
      final Z t = a.add(b);
      if (t.isEven()) {
        a = b;
        b = t.divide2();
      } else {
        final Z u = b.subtract(a).abs();
        a = b;
        b = u;
      }
      ++k;
    }
    return Z.valueOf(k);
  }
}

