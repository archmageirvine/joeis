package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069216 Numbers n such that sigma(n) = reversal(n).
 * @author Sean A. Irvine
 */
public class A069216 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(mN).equals(Functions.REVERSE.z(mN))) {
        return mN;
      }
    }
  }
}

