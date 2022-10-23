package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055897 a(n) = n*(n-1)^(n-1).
 * @author Georg Fischer
 */
public class A055897 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - 1).pow(mN - 1).multiply(mN);
  }
}
