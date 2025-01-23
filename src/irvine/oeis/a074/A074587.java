package irvine.oeis.a074;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074587 extends A074586 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> mB.get(mN, k));
  }
}
