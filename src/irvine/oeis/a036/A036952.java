package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036952 Numbers whose binary expansion is a decimal prime.
 * @author Sean A. Irvine
 */
public class A036952 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (new Z(Long.toBinaryString(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
