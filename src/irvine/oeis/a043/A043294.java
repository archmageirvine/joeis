package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000984;

/**
 * A043294 Sum of digits of binomial(2n,n).
 * @author Sean A. Irvine
 */
public class A043294 extends A000984 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}

