package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A059276 Row sums of triangle in A059274.
 * @author Sean A. Irvine
 */
public class A059276 extends A059274 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
