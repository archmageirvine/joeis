package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033282 Triangle read by rows: T(n, k) is the number of diagonal dissections of a convex n-gon into k+1 regions.
 * @author Sean A. Irvine
 */
public class A033282 implements Sequence {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN - 3) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN - 3, mM).multiply(Binomial.binomial(mN + mM - 1, mM)).divide(mM + 1);
  }
}

