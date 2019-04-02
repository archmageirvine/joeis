package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014833 2^n - n(n+1)/2.
 * @author Sean A. Irvine
 */
public class A014833 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(mN * (long) (mN + 1) / 2);
  }
}
