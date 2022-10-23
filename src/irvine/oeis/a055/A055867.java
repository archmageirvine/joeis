package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055867 Fourth column of triangle A055864.
 * a(i)=0 for i=1, 2, 3; a(n) = n^3*(n+1)^(n-4), n &gt;= 4.
 * @author Georg Fischer
 */
public class A055867 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    return ++mN < 4 ? Z.ZERO : Z.valueOf(mN + 1).pow(mN - 4).multiply(Z.valueOf(mN).pow(3));
  }
}
