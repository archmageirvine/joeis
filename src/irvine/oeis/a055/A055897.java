package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055897 a(n) = n*(n-1)^(n-1).
 * @author Georg Fischer
 */
public class A055897 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - 1).pow(mN - 1).multiply(mN);
  }
}
