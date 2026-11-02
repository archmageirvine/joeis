package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087232 a(n) is the largest odd term in the 3x+1 trajectory initiated at n.
 * @author Sean A. Irvine
 */
public class A087232 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN.makeOdd();
    Z max = m;
    while (!Z.ONE.equals(m)) {
      m = m.multiply(3).add(1).makeOdd();
      if (m.compareTo(max) > 0) {
        max = m;
      }
    }
    return max;
  }
}
