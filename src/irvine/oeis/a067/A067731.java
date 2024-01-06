package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067731 Maximum number of distinct parts in a self-conjugate partition of n, or 0 if n=2.
 * @author Sean A. Irvine
 */
public class A067731 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long r = CR.valueOf(8 * ++mN + 1).sqrt().subtract(1).divide(2).floor().longValueExact();
    final long s = mN - r * (r + 1) / 2;
    return Z.valueOf(r - (s & 1));
  }
}
