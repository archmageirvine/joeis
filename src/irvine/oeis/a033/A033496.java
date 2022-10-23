package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033496 Numbers n such that initial number is largest number in trajectory of Collatz (3x+1) problem.
 * @author Sean A. Irvine
 */
public class A033496 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return Z.ONE; // 1 is the only odd member of this sequence
    }
    while (true) {
      mN = mN.add(2);
      Z m = mN;
      Z max = m;
      while (!Z.ONE.equals(m)) {
        m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
        max = max.max(m);
      }
      if (max.equals(mN)) {
        return mN;
      }
    }
  }
}
