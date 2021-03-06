package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000108;

/**
 * A004095 Sum of digits of Catalan numbers.
 * @author Sean A. Irvine
 */
public class A004095 extends A000108 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}

