package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055862 Fourth column of triangle A055858.
 * a(i)=0, i=0, 1, 2; a(n)= (n^2)*(n+1)^(n-2), n &gt;= 3.
 * @author Georg Fischer
 */
public class A055862 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    return ++mN < 3 ? Z.ZERO : Z.valueOf(mN + 1).pow(mN - 2).multiply(mN).multiply(mN);
  }
}
