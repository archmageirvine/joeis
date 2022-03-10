package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055070 Third column of triangle A055864.
 * <code>a(1)=0= a(2); a(n)= n^2*(n+1)^(n-3), n >= 3</code>.
 * @author Georg Fischer
 */
public class A055070 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN < 3) {
      return Z.ZERO;
    }
    return Z.valueOf(mN).square().multiply(Z.valueOf(mN + 1).pow(mN - 3));
  }
}

