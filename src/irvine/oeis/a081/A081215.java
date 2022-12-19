package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081215 a(n) = (n^(n+1)+(-1)^n)/(n+1)^2.
 * @author Georg Fischer
 */
public class A081215 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN + 1).add(((mN & 1) == 0) ? 1 : -1).divide((mN + 1) * (mN + 1));
  }
}
