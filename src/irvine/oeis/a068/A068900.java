package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068900 Digit reversal of n = 11 times digit reversal of n/11.
 * @author Sean A. Irvine
 */
public class A068900 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN % 10 != 0 && Functions.REVERSE.l(11 * mN) == 11 * Functions.REVERSE.l(mN)) {
        return Z.valueOf(11 * mN);
      }
    }
  }
}
