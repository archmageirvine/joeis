package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A059040 Row sums of triangle A059037.
 * @author Sean A. Irvine
 */
public class A059040 extends A059037 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> get(mN, k));
  }
}
