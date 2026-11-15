package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087393 a(1) = 1, a(n) = smallest number beginning with a(n-1) == 0 (mod n!).
 * @author Sean A. Irvine
 */
public class A087393 extends Sequence1 {

  private Z mA = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    final Z f = Functions.FACTORIAL.z(++mN);
    final String str = mA.toString();
    Z t = mA;
    while (true) {
      final Z r = t.mod(f);
      if (r.isZero()) {
        mA = t;
        return mA;
      }
      final Z u = t.add(f.subtract(r));
      if (u.toString().startsWith(str)) {
        mA = u;
        return mA;
      }
      t = t.multiply(10);
    }
  }
}

