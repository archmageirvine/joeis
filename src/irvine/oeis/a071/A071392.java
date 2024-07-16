package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071392 Reverse of smallest prime factor of n = largest prime factor of n+1; a(1)=1.
 * @author Sean A. Irvine
 */
public class A071392 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (true) {
      if (Functions.REVERSE.l(Functions.LPF.l(mN)) == Functions.GPF.l(mN + 1)) {
        return Z.valueOf(mN);
      }
      ++mN;
    }
  }
}
