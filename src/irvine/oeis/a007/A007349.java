package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A007349 Primes with both 10 and -10 as primitive root.
 * @author Sean A. Irvine
 */
public class A007349 extends A007348 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (ZUtils.isPrimitiveRoot(Z.TEN, t)) {
        return t;
      }
    }
  }
}
