package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036978 Numbers for which the "describe what you see" transform A045918 produces a prime.
 * @author Sean A. Irvine
 */
public class A036978 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Functions.LOOK_AND_SAY.z(mN).isProbablePrime()) {
        return mN;
      }
    }
  }
}

