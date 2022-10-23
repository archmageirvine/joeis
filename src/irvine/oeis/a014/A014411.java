package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014411 Triangular array formed from elements to right of middle of rows of Pascal's triangle that are not 1.
 * @author Sean A. Irvine
 */
public class A014411 extends Sequence1 {

  private long mN = 2;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = (mN + 2) / 2;
    }
    return Binomial.binomial(mN, mM);
  }
}
