package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070916 a(1)=1, a(n) is the smallest integer &gt;= a(n-1) such that a(n)*a(n-1) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A070916 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      Z t = mA;
      while (true) {
        final Z u = t.multiply(mA).subtract(1);
        if (u.isProbablePrime()) {
          mA = t;
          return mA;
        }
        t = t.add(1);
      }
    }
  }
}
