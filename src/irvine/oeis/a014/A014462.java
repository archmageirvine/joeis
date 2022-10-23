package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014462 Triangular array formed from elements to left of middle of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A014462 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= (mN + 1) / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM);
  }
}
