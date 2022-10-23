package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052082 Squares with at least one of the decimal expansion digits occurring separated.
 * @author Sean A. Irvine
 */
public class A052082 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (!A052081.isDigitsGrouped(s)) {
        return s;
      }
    }
  }
}

