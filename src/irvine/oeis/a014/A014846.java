package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014846 2^(n-1) - n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A014846 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN++).subtract(mN * (long) (mN + 1) / 2);
  }
}
