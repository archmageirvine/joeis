package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052083 a(n)^3 is a cube whose decimal expansion's digits are grouped together.
 * @author Sean A. Irvine
 */
public class A052083 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (A052081.isDigitsGrouped(mN.pow(3))) {
        return mN;
      }
    }
  }
}

