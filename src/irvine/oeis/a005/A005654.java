package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005654 Number of bracelets (turn over necklaces) with n red, 1 pink and <code>n-1</code> blue beads; also reversible strings with n red and <code>n-1</code> blue beads; also <code>next-to-central</code> column in Losanitsch's triangle <code>A034851</code>.
 * @author Sean A. Irvine
 */
public class A005654 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN - 1, mN).add(Binomial.binomial(mN - 1, mN / 2)).divide2();
  }
}
