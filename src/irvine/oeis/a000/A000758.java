package irvine.oeis.a000;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a080.A080936;

/**
 * A000758 Sum over rooted plane trees with n edges of (height - 1); height = measured edges.
 * @author Sean A. Irvine
 */
public class A000758 extends A080936 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> t(mN, k.intValue()).multiply(k));
  }
}
