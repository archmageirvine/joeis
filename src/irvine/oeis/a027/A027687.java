package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027687 4-perfect (quadruply-perfect or sous-triple) numbers: sum of divisors of n is 4n.
 * @author Sean A. Irvine
 */
public class A027687 implements Sequence {

  private Z mN = Z.valueOf(30239);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma().equals(mN.shiftLeft(2))) {
        return mN;
      }
    }
  }
}
