package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174639 Triangle read by rows: T(n,k) = binomial(n,k) * bell(k+1) * bell(n-k+1) - bell(n+1) + 1 where bell(n) = A000110(n) are the Bell numbers.
 * @author Sean A. Irvine
 */
public class A174639 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).multiply(Functions.BELL.z(mM + 1)).multiply(Functions.BELL.z(mN - mM + 1))
      .subtract(Functions.BELL.z(mN + 1)).add(1);
  }
}

