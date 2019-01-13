package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005150;

/**
 * A004977.
 * @author Sean A. Irvine
 */
public class A004977 extends A005150 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
