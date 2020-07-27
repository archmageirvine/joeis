package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033984 Odd integers n such that <code>2^n == 16 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A033984 implements Sequence {

  private static final Z Z16 = Z.valueOf(16);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Z.TWO.modPow(mN, mN).equals(Z16.mod(mN))) {
        return mN;
      }
    }
  }
}
