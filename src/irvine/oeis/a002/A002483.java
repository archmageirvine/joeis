package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.LongUtils;

/**
 * A002483 Expansion of Jacobi theta function {theta_1}'(q) in powers of q^(1/4).
 * @author Sean A. Irvine
 */
public class A002483 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    if (s * s == mN && (s & 1) == 1) {
      final Z r = Z.valueOf(s).multiply2();
      if ((s & 3) == 3) {
        return r.negate();
      } else {
        return r;
      }
    }
    return Z.ZERO;
  }
}
