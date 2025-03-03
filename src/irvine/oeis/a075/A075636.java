package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A075636 Sums of groups in A075635.
 * @author Sean A. Irvine
 */
public class A075636 extends A075635 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
