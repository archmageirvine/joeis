package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023196 Nondeficient numbers: numbers k such that sigma(k) &gt;= 2k; union of A000396 and A005101.
 * @author Sean A. Irvine
 */
public class A023196 implements Sequence {

  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma().compareTo(mN.multiply2()) >= 0) {
        return mN;
      }
    }
  }
}
