package irvine.oeis.a064;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A064880 Row sums of triangle A064879.
 * @author Sean A. Irvine
 */
public class A064880 extends A064879 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> t(mN, k));
  }
}

