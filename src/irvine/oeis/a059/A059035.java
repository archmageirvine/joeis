package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A059035 Row sums of A059032.
 * @author Sean A. Irvine
 */
public class A059035 extends A059032 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> get(mN, k));
  }
}
