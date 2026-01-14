package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A083175 Row sums in A083175.
 * @author Sean A. Irvine
 */
public class A083175 extends A083173 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, j -> super.next());
  }
}

