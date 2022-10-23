package irvine.oeis.a202;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A202944  G.f.: Sum_{n&gt;=0} (n+1)*(n+2)/2 * 2^(n*(n-1)) * x^n.
 * @author Georg Fischer
 */
public class A202944 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN * (mN - 1)).multiply((mN + 1) * (mN + 2) / 2);
  }
}
