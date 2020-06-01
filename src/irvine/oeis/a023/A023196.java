package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023196 Nondeficient numbers: numbers n such that <code>sigma(n) &gt;= 2n;</code> union of <code>A000396</code> and <code>A005101</code>.
 * @author Sean A. Irvine
 */
public class A023196 implements Sequence {

  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma().compareTo(mN.multiply2()) >= 0) {
        return mN;
      }
    }
  }
}
