package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A014410 Elements in Pascal's triangle (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A014410 extends Sequence2 {

  protected long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM);
  }
}
