package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025586 Largest value in '3x+1' trajectory of n.
 * @author Sean A. Irvine
 */
public class A025586 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z max = mN;
    Z m = mN;
    while (!Z.ONE.equals(m)) {
      if (m.isEven()) {
        m = m.makeOdd();
      } else {
        m = m.multiply(3).add(1);
        if (m.compareTo(max) > 0) {
          max = m;
        }
      }
    }
    return max;
  }
}
