package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005117;

/**
 * A062084 Squarefree numbers such that every digit as well as sum of the digits is a squarefree number.
 * @author Sean A. Irvine
 */
public class A062084 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((ZUtils.syn(t) & 0b1100010001) == 0 && LongUtils.isSquareFree(ZUtils.digitSum(t))) {
        return t;
      }
    }
  }
}
