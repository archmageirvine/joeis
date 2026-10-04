package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071008 Numbers k such that uphi(uphi(k)) = k/2.
 * @author Sean A. Irvine
 */
public class A071008 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.UPHI.l(Functions.UPHI.l(++mN)) * 2 == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
