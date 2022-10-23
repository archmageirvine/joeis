package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055868 Fifth column of triangle A055864.
 * a(i)=0 for i=1..4; a(n)= n^4*(n+1)^(n-5), n &gt;= 5.
 * @author Georg Fischer
 */
public class A055868 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    return ++mN < 5 ? Z.ZERO : Z.valueOf(mN + 1).pow(mN - 5).multiply(Z.valueOf(mN).pow(4));
  }
}
