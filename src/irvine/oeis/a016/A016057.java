package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016057 Pseudo-powers to base 3: n divides <code>2^n + 1, n</code> not a power of 3.
 * @author Sean A. Irvine
 */
public class A016057 implements Sequence {

  private Z mN = Z.valueOf(170);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN, mN).equals(mN.subtract(1))) {
        final Z base = mN.isPower();
        if (!Z.THREE.equals(base)) {
          return mN;
        }
      }
    }
  }
}
