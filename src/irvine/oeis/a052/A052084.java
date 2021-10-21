package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052084 Cubes with at least one of the decimal digits occurring separated.
 * @author Sean A. Irvine
 */
public class A052084 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.pow(3);
      if (!A052081.isDigitsGrouped(s)) {
        return s;
      }
    }
  }
}

