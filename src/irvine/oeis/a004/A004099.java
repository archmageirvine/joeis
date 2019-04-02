package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000111;

/**
 * A004099 Sum of digits of Euler numbers.
 * @author Sean A. Irvine
 */
public class A004099 extends A000111 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}

