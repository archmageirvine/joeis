package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006236 a(n) = n^(n-2)*(n+2)^(n-1).
 * @author Sean A. Irvine
 */
public class A006236 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN - 2).multiply(Z.valueOf(mN + 2).pow(mN - 1));
  }
}
