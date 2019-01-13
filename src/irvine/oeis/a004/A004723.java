package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004723.
 * @author Sean A. Irvine
 */
public class A004723 implements Sequence {

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

