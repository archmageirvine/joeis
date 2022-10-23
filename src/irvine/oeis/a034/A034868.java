package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034868 Left half of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A034868 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM);
  }
}
