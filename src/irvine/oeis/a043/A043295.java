package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000367;

/**
 * A043295 Sum of digits of numerator of Bernoulli number B(2n).
 * @author Sean A. Irvine
 */
public class A043295 extends A000367 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next().abs()));
  }
}

