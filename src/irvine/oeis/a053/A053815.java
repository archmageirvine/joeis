package irvine.oeis.a053;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053815 Floor(n / (sum of proper divisors of n)).
 * @author Sean A. Irvine
 */
public class A053815 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(Cheetah.factor(mN).sigma().subtract(mN));
  }
}

