package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005732.
 * @author Sean A. Irvine
 */
public class A005732 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 3, 6).add(Binomial.binomial(mN + 1, 5)).add(Binomial.binomial(mN, 5));
  }
}
