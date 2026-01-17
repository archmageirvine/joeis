package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a006.A006937;

/**
 * A392339 Number of decimal digit 1's in A006937(n).
 * @author Sean A. Irvine
 */
public class A392339 extends A006937 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(super.next())[1]);
  }
}
