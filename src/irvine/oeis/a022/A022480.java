package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a006.A006711;

/**
 * A022480 Sum of digits in n-th term of <code>A006711</code>.
 * @author Sean A. Irvine
 */
public class A022480 extends A006711 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
