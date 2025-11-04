package irvine.oeis.a081;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A081540 Sum of terms in row n of A081539.
 * @author Sean A. Irvine
 */
public class A081540 extends A081539 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> super.next());
  }
}
