package irvine.oeis.a076;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A076124 Square roots of squares pertaining to A076123.
 * @author Sean A. Irvine
 */
public class A076124 extends A076123 {

  @Override
  public Z next() {
    if (!mA.isEmpty()) {
      super.next();
    }
    super.next();
    return Integers.SINGLETON.product(mA.size() / 2, mA.size() - 1, k -> Z.valueOf(mA.get(k))).sqrt();
  }
}
