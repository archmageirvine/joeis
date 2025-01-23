package irvine.oeis.a074;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074663 extends A074589 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
