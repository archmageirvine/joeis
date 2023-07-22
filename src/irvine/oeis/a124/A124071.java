package irvine.oeis.a124;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A124071 a(1)=1. a(n) = GCD(n,a(n-1)) + GCD(n+1,a(n-1)).
 * @author Georg Fischer
 */
public class A124071 extends Sequence1 {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    final Z result = Z.valueOf(mN).gcd(mA).add(Z.valueOf(mN + 1).gcd(mA));
    mA = result;
    return result;
  }
}
