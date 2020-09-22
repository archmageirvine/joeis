package irvine.oeis.a035;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A035015.
 * @author Sean A. Irvine
 */
public class A035015 extends A003285 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (LongUtils.isSquareFree(mN) && !Z.ZERO.equals(t)) {
        return t;
      }
    }
  }
}
