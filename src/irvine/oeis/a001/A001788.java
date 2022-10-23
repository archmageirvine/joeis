package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001788 a(n) = n*(n+1)*2^(n-2).
 * @author Sean A. Irvine
 */
public class A001788 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).shiftLeft(mN - 2);
  }
}
