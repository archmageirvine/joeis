package irvine.oeis.a090;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A090850 Clark's triangle with f=6 read by row.
 * @author Sean A. Irvine
 */
public class A090850 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (mN < 0) {
      mN = 0;
      return Z.ZERO;
    }
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM + 1).multiply(6).add(Binomial.binomial(mN - 1, mM - 1));
  }
}
