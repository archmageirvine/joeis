package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391533 The truncated (4,4,1)-Pascal triangle, given by 4*C(n-2, k) + 4*C(n-2, k-1) + C(n-2, k-2) for n&gt;=2.
 * @author Sean A. Irvine
 */
public class A391533 extends Sequence2 {

  private int mN = 2;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN - 2, mM).add(Binomial.binomial(mN - 2, mM - 1)).multiply(4).add(Binomial.binomial(mN - 2, mM - 2));
  }
}

