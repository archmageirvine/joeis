package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011847.
 * @author Sean A. Irvine
 */
public class A011847 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).divide(mM + 1);
  }
}

