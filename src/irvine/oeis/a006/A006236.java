package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006236 n^(n-2)*(n+2)^(n-1).
 * @author Sean A. Irvine
 */
public class A006236 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN - 2).multiply(Z.valueOf(mN + 2).pow(mN - 1));
  }
}
