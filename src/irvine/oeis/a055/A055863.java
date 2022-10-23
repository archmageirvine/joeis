package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055863 Fifth column of triangle A055858.
 * a(i)=0, i=0..3; a(n)= (n^3)*(n+1)^(n-3), n &gt;= 4.
 * @author Georg Fischer
 */
public class A055863 extends Sequence0 {

  protected int mN;

  /** Construct the sequence. */
  public A055863() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return mN < 4 ? Z.ZERO : Z.valueOf(mN + 1).pow(mN - 3).multiply(mN).multiply(mN).multiply(mN);
  }
}
