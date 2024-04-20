package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014673 Smallest prime factor of greatest proper divisor of n.
 * @author Sean A. Irvine
 */
public class A014673 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long m = mN / Functions.LPF.l(mN);
    if (m == 1) {
      return Z.ONE;
    }
    return Functions.LPF.z(m);
  }
}

