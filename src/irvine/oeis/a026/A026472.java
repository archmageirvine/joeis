package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026472 <code>{3, 7}</code> together with the numbers congruent to <code>{1, 2} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A026472 implements Sequence {

  // Using the empirical definition of Ralf Stephan

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.THREE.equals(mN) || Z.SEVEN.equals(mN)) {
        return mN;
      }
      final long r = mN.mod(12);
      if (r == 1 || r == 2) {
        return mN;
      }
    }
  }
}
