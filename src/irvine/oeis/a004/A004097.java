package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000110;

/**
 * A004097 Sum of digits of Bell numbers.
 * @author Sean A. Irvine
 */
public class A004097 extends A000110 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}

