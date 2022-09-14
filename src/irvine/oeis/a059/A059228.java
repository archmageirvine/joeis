package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A059228 Row sums of triangle defined in A059226.
 * @author Sean A. Irvine
 */
public class A059228 extends A059226 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
