package irvine.oeis.a209;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A209518.
 * @author Sean A. Irvine
 */
public class A209518 implements Sequence {

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
