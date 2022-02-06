package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054514 Number of ways to place non-crossing diagonals in convex (n+4)-gon so as to create no triangles or quadrilaterals.
 * @author Sean A. Irvine
 */
public class A054514 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, (mN - 1) / 3, k -> Binomial.binomial(mN - 2L * k - 1, mN - 3L * k - 1).multiply(Binomial.binomial(mN + 3 + k, mN + 2))).divide(mN + 3);
  }
}

