package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055865 Second column of triangle A055864.
 * a(1)=0; a(n)= n*(n+1)^(n-2), n &gt;= 2.
 * @author Georg Fischer
 */
public class A055865 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    return ++mN < 2 ? Z.ZERO : Z.valueOf(mN + 1).pow(mN - 2).multiply(mN);
  }
}
