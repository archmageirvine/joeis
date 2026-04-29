package irvine.oeis.a088;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A088588 Natural two base element sequence based on Pi and e and a prime sequence.
 * @author Sean A. Irvine
 */
public class A088588 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long f = (mN + 1) / 2;
    return CR.valueOf(Z.valueOf(f).multiply(f + 1).divide(2)).exp().multiply(CR.PI).multiply(Functions.PRIMORIAL_COUNT.z(mN / 2)).floor();
  }
}
