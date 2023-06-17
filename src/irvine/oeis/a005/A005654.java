package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005654 Number of bracelets (turn over necklaces) with n red, 1 pink and n-1 blue beads; also reversible strings with n red and n-1 blue beads; also next-to-central column in Losanitsch's triangle A034851.
 * @author Sean A. Irvine
 */
public class A005654 extends AbstractSequence {

  /** Construct the sequence. */
  public A005654() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN - 1, mN).add(Binomial.binomial(mN - 1, mN / 2)).divide2();
  }
}
