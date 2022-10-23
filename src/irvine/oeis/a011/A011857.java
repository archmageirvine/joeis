package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A011857 Triangle of numbers [ C(n,k)/k ], k=1..n-1.
 * @author Sean A. Irvine
 */
public class A011857 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM).divide(mM);
  }
}

