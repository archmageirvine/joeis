package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081216 a(n) = (n^n-(-1)^n)/(n+1).
 * @author Georg Fischer
 */
public class A081216 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN).subtract(((mN & 1) == 0) ? 1 : -1).divide(mN + 1);
  }
}
