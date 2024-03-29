package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001580 a(n) = 2^n + n^2.
 * @author Sean A. Irvine
 */
public class A001580 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(mN * (long) mN);
  }
}
