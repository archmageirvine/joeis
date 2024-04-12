package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069206.
 * @author Sean A. Irvine
 */
public class A069206 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN) || mN.mod(7) == 3) {
      return Z.ZERO;
    }
    Z a = Z.ONE;
    Z b = mN;
    long k = 2;
    while (!b.isZero()) {
      final Z t = a.add(b);
      if (t.isEven()) {
        a = b;
        b = t.divide2();
      } else {
        final Z u = b.subtract(a);
        a = b;
        b = u;
      }
      ++k;
    }
    return Z.valueOf(k);
  }
}

