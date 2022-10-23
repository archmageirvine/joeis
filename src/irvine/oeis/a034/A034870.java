package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034870 Even-numbered rows of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A034870 extends Sequence0 {

  private long mN = -2;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mN += 2;
      mM = 0;
    }
    return Binomial.binomial(mN, mM);
  }
}
