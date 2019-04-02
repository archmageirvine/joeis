package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A004090 Sum of digits of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A004090 extends A000045 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}

