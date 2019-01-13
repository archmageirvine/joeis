package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004726.
 * @author Sean A. Irvine
 */
public class A004726 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString().replace("7", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

