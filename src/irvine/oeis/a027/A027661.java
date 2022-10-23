package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027661 Fractional part of decimal expansion of sqrt(n) to 3 places.
 * @author Sean A. Irvine
 */
public class A027661 extends Sequence1 {

  private static final CR CR1000 = CR.valueOf(1000);
  private static final Z Z1000 = Z.valueOf(1000);
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(CR1000).round().mod(Z1000);
  }
}
