package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074828 a(1) = 1; for n&gt;1, a(n) = smallest composite multiple of n if n is a prime else the smallest prime divisor of n if n is composite.
 * @author Sean A. Irvine
 */
public class A074828 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long lpf = Functions.LPF.l(mN);
    return Z.valueOf(lpf == mN ? 2 * mN : lpf);
  }
}
