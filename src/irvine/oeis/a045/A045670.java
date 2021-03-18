package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a007.A007932;

/**
 * A045670 Digital sum (in base 10) of numbers in base 3 of the alternate number system.
 * @author Sean A. Irvine
 */
public class A045670 extends A007932 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
