package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028369 a(n) = 2^(2^(n-1) + n - 2).
 * @author Sean A. Irvine
 */
public class A028369 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(Z.ONE.shiftLeft(mN++).longValueExact() + mN - 2);
  }
}
