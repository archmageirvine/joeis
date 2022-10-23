package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004723 Delete all 4's from the sequence of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A004723 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString().replace("4", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

