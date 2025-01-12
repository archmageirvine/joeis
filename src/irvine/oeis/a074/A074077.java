package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a068.A068119;

/**
 * A074077 a(n) = 3n - Sum_{k=1..n} A068119(n).
 * @author Sean A. Irvine
 */
public class A074077 extends A068119 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(3).subtract(super.next());
    return mSum;
  }
}
