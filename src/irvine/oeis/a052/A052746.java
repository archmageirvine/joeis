package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052746 a(0) = 0; a(n) = (2*n)^(n-1), n &gt; 0.
 * @author Georg Fischer
 */
public class A052746 extends Sequence0 {

  protected int mN = -1;
  
  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : Z.valueOf(mN).multiply2().pow(mN - 1);
  }
}
