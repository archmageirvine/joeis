package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005656 Number of bracelets (turn over necklaces) with n red, 1 pink and <code>n - 3</code> blue beads; also reversible strings with n red and <code>n-3</code> blue beads.
 * @author Sean A. Irvine
 */
public class A005656 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    return Binomial.binomial(2 * mN - 3, mN - 3).add(Binomial.binomial(mN - 2, (mN - 3) / 2)).divide2();
  }
}

