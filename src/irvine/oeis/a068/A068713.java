package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068713 Numbers k for which 10*2^k + 3 is a prime (giving terms of A068712).
 * @author Sean A. Irvine
 */
public class A068713 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.TEN.shiftLeft(++mN).add(3).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
