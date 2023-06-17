package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A016057 Pseudo-powers to base 3: numbers k that are not powers of 3 such that k divides 2^k + 1.
 * @author Sean A. Irvine
 */
public class A016057 extends AbstractSequence {

  /** Construct the sequence. */
  public A016057() {
    super(1);
  }

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
