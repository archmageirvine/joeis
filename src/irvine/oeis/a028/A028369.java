package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028369 a(n) = 2^(2^(n-1) + n - 2).
 * @author Sean A. Irvine
 */
public class A028369 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(Z.ONE.shiftLeft(mN++).intValueExact() + mN - 2);
  }
}
