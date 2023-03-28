package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a034.A034886;

/**
 * A056851 Integers n such that the number of digits in n! is a cube.
 * @author Sean A. Irvine
 */
public class A056851 extends A034886 {

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.isCube(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
