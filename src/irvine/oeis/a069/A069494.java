package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069494 Numbers n such that (reversal(n))^3 = reversal(n^3). Ignore leading 0's.
 * @author Sean A. Irvine
 */
public class A069494 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.z(++mN).pow(3).equals(Functions.REVERSE.z(Z.valueOf(mN).pow(3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

