package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000041;

/**
 * A004088 Sum of digits of number of partitions of n.
 * @author Sean A. Irvine
 */
public class A004088 extends A000041 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}

