package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023198 Numbers k such that sigma(k) &gt;= 4*k.
 * @author Sean A. Irvine
 */
public class A023198 implements Sequence {

  private Z mN = Z.valueOf(27719);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma().compareTo(mN.multiply(4)) >= 0) {
        return mN;
      }
    }
  }
}
