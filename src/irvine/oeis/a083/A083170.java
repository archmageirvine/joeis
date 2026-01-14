package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A083170 Row sums in A083167.
 * @author Sean A. Irvine
 */
public class A083170 extends A083167 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, j -> super.next());
  }
}

