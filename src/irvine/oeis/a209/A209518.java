package irvine.oeis.a209;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A209518 Triangle by rows, reversal of A104712.
 * @author Sean A. Irvine
 */
public class A209518 extends Sequence0 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    return Binomial.binomial(mN, mN + 2 - mM);
  }
}
