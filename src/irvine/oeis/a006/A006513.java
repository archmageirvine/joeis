package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006513 Limit of the image of n after 2k iterates of `(3x+1)/2' map as k grows.
 * @author Sean A. Irvine
 */
public class A006513 extends Sequence1 {

  private Z mN = Z.ZERO;

  private Z step(final Z n) {
    return n.isEven() ? n.divide2() : n.multiply(3).add(1).divide2();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    while (true) {
      m = step(step(m)); // Even number of steps
      if (m.compareTo(Z.TWO) <= 0) {
        return m;
      }
    }
  }
}
