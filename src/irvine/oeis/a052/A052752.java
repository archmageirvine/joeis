package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052752 a(n) = (3*n+1)^(n-1).
 * @author Georg Fischer
 */
public class A052752 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : Z.valueOf(mN).multiply(Z.THREE).add(1).pow(mN - 1);
  }
}
