package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005150;

/**
 * A004977 Sum of digits of n-th term in Look and Say sequence <code>A005150</code>.
 * @author Sean A. Irvine
 */
public class A004977 extends A005150 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
