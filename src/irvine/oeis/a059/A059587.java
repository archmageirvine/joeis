package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059587 T(n,m) = (1/m!)*Sum_{i=0..m} stirling1(m,i)*(2^i)*(2^i+1)*...*(2^i+n-1).
 * @author Sean A. Irvine
 */
public class A059587 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > 1 << mN) {
      ++mN;
      mM = 0;
    }
    final Z m = Z.valueOf(mM);
    return Integers.SINGLETON.sum(0, mN, k -> Stirling.firstKind(mN, k).abs().multiply(Binomial.binomial(Z.ONE.shiftLeft(k), m)));
  }
}
