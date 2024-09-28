package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072393 extends Sequence1 {

  private long mN = 90;

  @Override
  public Z next() {
    while (true) {
      if (++mN - Functions.REVERSE.l(mN) == Functions.PHI.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
