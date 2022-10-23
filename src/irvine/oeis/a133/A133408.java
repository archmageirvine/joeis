package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A133408 Numbers n such that n is a substring of both its square and its cube in base 2 (written in base 10).
 * @author Sean A. Irvine
 */
public class A133408 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String n = mN.toString(2);
      final Z s = mN.square();
      if (s.toString(2).contains(n) && s.multiply(mN).toString(2).contains(n)) {
        return mN;
      }
    }
  }
}

