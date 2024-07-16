package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071393 Reverse of largest prime factor of n = smallest prime factor of n+1; a(1)=1.
 * @author Sean A. Irvine
 */
public class A071393 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (true) {
      if (Functions.REVERSE.l(Functions.GPF.l(mN)) == Functions.LPF.l(mN + 1)) {
        return Z.valueOf(mN);
      }
      ++mN;
    }
  }
}
