package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080837 Jouka numbers: either the number is divisible by 7 or 11 or has a 7 in its decimal representation.
 * @author Georg Fischer
 */
public class A080837 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN % 7 == 0 || mN % 11 == 0 || String.valueOf(mN).indexOf('7') >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
