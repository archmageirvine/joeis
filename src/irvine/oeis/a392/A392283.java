package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392283 Numbers k such that phi(k) divides k + 3.
 * @author Sean A. Irvine
 */
public class A392283 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    // Some contortions to handle the only even value
    if (mN == 0) {
      mN = -1;
      return Z.ONE;
    }
    if (mN == -1) {
      mN = 1;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      if ((mN + 3) % Functions.PHI.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

