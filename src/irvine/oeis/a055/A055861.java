package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055861 Essentially A053506 but with leading 0 (instead of 1) and offset 0.
 * a(0) = 0 = a(1); a(n) = n*(n+1)^(n-1), n &gt;= 2.
 * @author Georg Fischer
 */
public class A055861 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    return ++mN < 2 ? Z.ZERO : Z.valueOf(mN + 1).pow(mN - 1).multiply(mN);
  }
}
