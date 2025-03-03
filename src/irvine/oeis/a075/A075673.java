package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a024.A024675;

/**
 * A075673 Sum of next n integer interprimes (cf. A024675).
 * @author Sean A. Irvine
 */
public class A075673 extends A024675 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
