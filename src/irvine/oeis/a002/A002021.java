package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002021 Pile of coconuts problem: (n-1)(n^n - 1), n even; n^n - n + 1, n odd.
 * @author Sean A. Irvine
 */
public class A002021 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN).pow(mN).subtract(1).multiply(mN - 1)
      : Z.valueOf(mN).pow(mN).subtract(mN - 1);
  }
}
