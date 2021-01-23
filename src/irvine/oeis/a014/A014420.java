package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A014420 Minimal number of Catalan numbers that sum to n.
 * @author Sean A. Irvine
 */
public class A014420 extends A014418 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
