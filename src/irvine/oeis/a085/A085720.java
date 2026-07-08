package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085720 Start of a run of 7 successive numbers which when concatenated form a prime.
 * @author Sean A. Irvine
 */
public class A085720 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z candidate = new Z(mN + String.valueOf(mN + 1) + (mN + 2) + (mN + 3) + (mN + 4) + (mN + 5) + (mN + 6));
      if (candidate.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
