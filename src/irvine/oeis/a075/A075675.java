package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a072.A072568;

/**
 * A075675 Sum of next n even interprimes.
 * @author Sean A. Irvine
 */
public class A075675 extends A072568 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
