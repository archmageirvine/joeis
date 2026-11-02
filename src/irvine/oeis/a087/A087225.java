package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087225 Position of the largest peak value in Collatz (3x+1) trajectory.
 * @author Sean A. Irvine
 */
public class A087225 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z max = mN;
    long maxK = 1;
    Z m = mN;
    long k = 1;
    while (!Z.ONE.equals(m)) {
      if (m.isEven()) {
        m = m.makeOdd();
        k += m.auxiliary();
      } else {
        ++k;
        m = m.multiply(3).add(1);
        if (m.compareTo(max) > 0) {
          max = m;
          maxK = k;
        }
      }
    }
    return Z.valueOf(maxK);
  }
}
