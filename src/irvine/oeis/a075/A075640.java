package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A075640 Sums of groups in A075639.
 * @author Sean A. Irvine
 */
public class A075640 extends A075639 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
