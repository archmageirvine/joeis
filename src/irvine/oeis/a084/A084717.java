package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084717 a(1) = 3 then a(n) = smallest multiple of a(n-1) &gt; a(n-1) such that a(n) - 1 is a prime.
 * @author Sean A. Irvine
 */
public class A084717 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
      return mA;
    }
    final Z t = mA;
    while (true) {
      mA = mA.add(t);
      if (mA.subtract(1).isProbablePrime()) {
        return mA;
      }
    }
  }
}
