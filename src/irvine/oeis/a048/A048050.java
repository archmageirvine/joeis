package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001065;

/**
 * A048050 Chowla's function: sum of divisors of n except 1 and n.
 * @author Sean A. Irvine
 */
public class A048050 extends A001065 {

  @Override
  public Z next() {
    return super.next().subtract(1).max(Z.ZERO);
  }
}
