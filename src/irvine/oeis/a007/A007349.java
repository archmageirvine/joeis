package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A007349.
 * @author Sean A. Irvine
 */
public class A007349 extends A007348 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (ZUtils.testPrimitiveRoot(Z.TEN, t)) {
        return t;
      }
    }
  }
}
